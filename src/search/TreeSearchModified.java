package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TreeSearchModified < A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        ArrayDeque<Node<A>> fringe = new ArrayDeque<>();
        fringe.add(problem.getInitialState());
        while (true){
            if (fringe.isEmpty())return new ArrayList<>();
            Node<A> node = fringe.getFirst();
            fringe.removeFirst();
            if (problem.goalTest(node)){
                Node<A> node1 = node;
                double min = node.cost;
                for (Node<A> aNode : fringe) {
                    if (problem.goalTest(aNode) && aNode.cost < min) {
                        min = aNode.cost;
                        node1 = aNode;
                    }
                }
                node = node1;
                ArrayList<Node<A>> arrayList = new ArrayList<>();
                ArrayDeque<Node<A>> temp = new ArrayDeque<>();
                while (node!=null){
                    temp.addFirst(node);
                    node= node.getParentNode();
                }
                arrayList.addAll(temp);
                return arrayList;
            }
            ArrayList<? extends Node<A>> c = problem.successorFunction(node);
            for (Node<A> aNode : c) {
                fringe.addLast(aNode);
            }
        }
    }
}
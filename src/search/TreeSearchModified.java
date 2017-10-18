package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class TreeSearchModified < A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        ArrayDeque<Node<A>> queue = new ArrayDeque<>();
        queue.add(problem.getInitialState());
        while (true){
            if (queue.isEmpty())return null;
            Node<A> node = queue.getFirst();
            queue.removeFirst();
            if (problem.goalTest(node)){
                Node<A> node1 = node;
                double min = node.cost;
                for (Node<A> aNode : queue) {
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
                queue.addLast(aNode);
            }
        }
    }
}
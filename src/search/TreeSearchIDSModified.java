package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.*;

public class TreeSearchIDSModified< A extends Action,T extends Problem<A>> {

    public ArrayList<Node<A>> solve(T problem){
        for (int i = 0; i < 50; i++) {
            ArrayList<Node<A>> dls = dls(problem, i);
            if (dls.isEmpty())continue;
            return dls;
        }
        return new ArrayList<>();
    }

    public ArrayList<Node<A>> dls(T problem , int depth){
        Stack<Node<A>> fringe = new Stack<>();
        Set<Node<A>> set = new HashSet<>();
        fringe.add(problem.getInitialState());
        while (true){
            if (fringe.isEmpty())return new ArrayList<>();
            Node<A> node = fringe.pop();
            set.add(node);
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
            }else {
                ArrayList<? extends Node<A>> c = problem.successorFunction(node);
                for (Node<A> aNode : c) {
                    if (set.add(aNode)&&aNode.depth<=depth)
                        fringe.add(aNode);
                }

            }
        }
    }
}

package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.*;

public class TreeSearchDLS< A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        Stack<Node<A>> fringe = new Stack<>();
        Set<Node<A>> set = new HashSet<>();
        fringe.add(problem.getInitialState());
        while (true){
            if (fringe.isEmpty())return new ArrayList<>();
            Node<A> node = fringe.pop();
            set.add(node);
            if (problem.goalTest(node)){
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
                    if (set.add(aNode)&&aNode.depth<=10)
                        fringe.add(aNode);
                }

            }
        }
    }
}

package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSearch < A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        LinkedList<Node<A>> fringe = new LinkedList<>();
        fringe.add(problem.getInitialState());
        while (true){
            if (fringe.isEmpty())return new ArrayList<>();
            Node<A> node = fringe.pop();
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
                fringe.addAll(c);
            }
        }
    }
}

package search;

import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.*;

public class TreeSearchUCSModified< A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        PriorityQueue<Node<A>> queue = new PriorityQueue<>();
        queue.add(problem.getInitialState());
        Set<Node<A>> set = new HashSet<>();
        while (true){
            if (queue.isEmpty())return new ArrayList<>();
            Node<A> node = queue.poll();
            set.add(node);
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
                if (set.add(aNode))
                    queue.add(aNode);
            }
        }
    }
}
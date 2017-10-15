import GeneralProblem.Action;
import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TreeSearch < A extends Action,T extends Problem<A>> {
    public ArrayList<Node<A>> solve(T problem){
        Queue<Node<A>> queue = new ArrayDeque<>();
        queue.add(problem.getInitialState());
        while (true){
            if (queue.isEmpty())return null;
            Node<A> node = queue.poll();
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
                queue.addAll(problem.successorFunction(node));
            }
        }
    }
}

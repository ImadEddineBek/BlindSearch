package Detachement;

import GeneralProblem.Node;
import search.TreeSearch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TreeSearch<Action, DetachmentProblem> treeSearch = new TreeSearch<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
    }
}

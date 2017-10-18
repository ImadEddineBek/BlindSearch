package Detachement;

import GeneralProblem.Node;
import search.*;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
        treeSearchModified();
        treeSearchDFS();
        treeSearchDLS();
        treeSearchUCS();
        treeSearchIDS();
    }

    private static void treeSearch() {
        System.out.println("Tree Search the original");
        TreeSearch<Action, DetachmentProblem> treeSearch = new TreeSearch<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, DetachmentProblem> treeSearch = new TreeSearchDFS<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, DetachmentProblem> treeSearch = new TreeSearchDLS<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchIDS() {
        System.out.println("Tree Search the IDS original");
        TreeSearchIDS<Action, DetachmentProblem> treeSearch = new TreeSearchIDS<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the IDS original\n");
    }
    private static void treeSearchUCS() {
        System.out.println("Tree Search the UCS original");
        TreeSearchUCS<Action, DetachmentProblem> treeSearch = new TreeSearchUCS<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the UCS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, DetachmentProblem> treeSearch = new TreeSearchModified<>();
        ArrayList<Node<Action>> solve = treeSearch.solve(new DetachmentProblem(new DetachmentNode(new DetachmentState(5, 0, true,true,true), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

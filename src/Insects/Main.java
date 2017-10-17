package Insects;

import GeneralProblem.Node;
import search.TreeSearch;
import search.TreeSearchModified;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
        treeSearchModified();
    }

    private static void treeSearch() {
        System.out.println("Tree Search the original");
        TreeSearch<Action, InsectsProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[4];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new InsectsProblem(new InsectsNode(new InsectsState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }

    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, InsectsProblem> treeSearch = new TreeSearchModified<>();
        boolean[] liste = new boolean[4];
        for (int i = 0; i < liste.length; i++) {
            liste[i] = true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new InsectsProblem(new InsectsNode(new InsectsState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

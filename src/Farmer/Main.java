package Farmer;


import GeneralProblem.Node;
import search.TreeSearch;
import search.TreeSearchDFS;
import search.TreeSearchModified;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
        treeSearchModified();
        treeSearchDFS();
    }

    private static void treeSearch() {
        System.out.println("Tree Search the original");
        TreeSearch<Action, FarmersProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, FarmersProblem> treeSearch = new TreeSearchDFS<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, FarmersProblem> treeSearch = new TreeSearchModified<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

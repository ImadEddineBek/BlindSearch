package Farmer;


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
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, FarmersProblem> treeSearch = new TreeSearchDLS<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchIDS() {
        System.out.println("Tree Search the IDS original");
        TreeSearchIDS<Action, FarmersProblem> treeSearch = new TreeSearchIDS<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the IDS original\n");
    }
    private static void treeSearchUCS() {
        System.out.println("Tree Search the UCS original");
        TreeSearchUCS<Action, FarmersProblem> treeSearch = new TreeSearchUCS<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the UCS original\n");
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

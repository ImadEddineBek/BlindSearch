package Missionaries;

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
        TreeSearch<Action, MissionaryProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, MissionaryProblem> treeSearch = new TreeSearchDFS<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, MissionaryProblem> treeSearch = new TreeSearchDLS<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchIDS() {
        System.out.println("Tree Search the IDS original");
        TreeSearchIDS<Action, MissionaryProblem> treeSearch = new TreeSearchIDS<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the IDS original\n");
    }
    private static void treeSearchUCS() {
        System.out.println("Tree Search the UCS original");
        TreeSearchUCS<Action, MissionaryProblem> treeSearch = new TreeSearchUCS<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the UCS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, MissionaryProblem> treeSearch = new TreeSearchModified<>();
        boolean[] liste = new boolean[7];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new MissionaryProblem(new MissionaryNode(new MissionaryState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

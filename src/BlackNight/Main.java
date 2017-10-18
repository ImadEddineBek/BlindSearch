package BlackNight;

import GeneralProblem.Node;
import search.TreeSearch;
import search.TreeSearchDFS;
import search.TreeSearchDLS;
import search.TreeSearchModified;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        treeSearch();
        treeSearchModified();
        treeSearchDFS();
        treeSearchDLS();
    }

    private static void treeSearch() {
        System.out.println("Tree Search the original");
        TreeSearch<Action, BlackProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, BlackProblem> treeSearch = new TreeSearchDFS<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, BlackProblem> treeSearch = new TreeSearchDLS<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        for (Node<Action> actionNode : solve) {
            System.out.println(actionNode);
        }
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, BlackProblem> treeSearch = new TreeSearchModified<>();
        boolean[] liste = new boolean[5];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new BlackProblem(new BlackNode(new BlackState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

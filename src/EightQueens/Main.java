package EightQueens;

import GeneralProblem.Node;
import search.*;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
//        treeSearch();
//        treeSearchModified();
        treeSearchDFS();
        treeSearchDLS();
        treeSearchUCS();
        treeSearchIDS();
    }

    private static void treeSearch() {
        System.out.println("Tree Search the original");
        TreeSearch<Action, QueensProblem> treeSearch = new TreeSearch<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, QueensProblem> treeSearch = new TreeSearchDFS<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, QueensProblem> treeSearch = new TreeSearchDLS<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        for (Node<Action> actionNode : solve) {
            System.out.println(actionNode);
        }
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchIDS() {
        System.out.println("Tree Search the IDS original");
        TreeSearchIDS<Action, QueensProblem> treeSearch = new TreeSearchIDS<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        for (Node<Action> actionNode : solve) {
            System.out.println(actionNode);
        }
        System.out.println("Tree Search the IDS original\n");
    }
    private static void treeSearchUCS() {
        System.out.println("Tree Search the UCS original");
        TreeSearchUCS<Action, QueensProblem> treeSearch = new TreeSearchUCS<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        for (Node<Action> actionNode : solve) {
            System.out.println(actionNode);
        }
        System.out.println("Tree Search the UCS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, QueensProblem> treeSearch = new TreeSearchModified<>();
        type[][] liste = new type[8][8];
        for (int i = 0; i < liste.length; i++) {
            for (int i1 = 0; i1 < liste[i].length; i1++) {
                liste[i][i1]=type.empty;
            }
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new QueensProblem(new QueensNode(new QueensState(liste), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

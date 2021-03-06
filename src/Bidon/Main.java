package Bidon;

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
        TreeSearch<Action, BidonsProblem> treeSearch = new TreeSearch<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchDFS() {
        System.out.println("Tree Search the DFS original");
        TreeSearchDFS<Action, BidonsProblem> treeSearch = new TreeSearchDFS<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DFS original\n");
    }
    private static void treeSearchDLS() {
        System.out.println("Tree Search the DLS original");
        TreeSearchDLS<Action, BidonsProblem> treeSearch = new TreeSearchDLS<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the DLS original\n");
    }
    private static void treeSearchIDS() {
        System.out.println("Tree Search the IDS original");
        TreeSearchIDS<Action, BidonsProblem> treeSearch = new TreeSearchIDS<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the IDS original\n");
    }
    private static void treeSearchUCS() {
        System.out.println("Tree Search the UCS original");
        TreeSearchUCS<Action, BidonsProblem> treeSearch = new TreeSearchUCS<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the UCS original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, BidonsProblem> treeSearch = new TreeSearchModified<>();
        Bidon bidon4 = new Bidon(4,0);
        Bidon bidon3 = new Bidon(3,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

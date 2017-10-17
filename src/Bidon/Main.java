package Bidon;

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
        TreeSearch<Action, BidonsProblem> treeSearch = new TreeSearch<>();
        Bidon bidon4 = new Bidon(3,0);
        Bidon bidon3 = new Bidon(4,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the original\n");
    }
    private static void treeSearchModified() {
        System.out.println("Tree Search the modified");
        TreeSearchModified<Action, BidonsProblem> treeSearch = new TreeSearchModified<>();
        Bidon bidon4 = new Bidon(3,0);
        Bidon bidon3 = new Bidon(4,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
        System.out.println("Tree Search the modified\n");
    }
}

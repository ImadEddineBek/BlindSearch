package Bidon;

import GeneralProblem.Node;
import search.TreeSearch;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        TreeSearch<Action, BidonsProblem> treeSearch = new TreeSearch<>();
        Bidon bidon4 = new Bidon(8,0);
        Bidon bidon3 = new Bidon(9,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(System.out::println);
    }
}

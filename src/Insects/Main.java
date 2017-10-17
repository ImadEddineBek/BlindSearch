package Insects;

import GeneralProblem.Node;
import search.TreeSearch;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        TreeSearch<Action, InsectsProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[4];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new InsectsProblem(new InsectsNode(new InsectsState(liste), null, null)));
        solve.forEach(System.out::println);
    }
}

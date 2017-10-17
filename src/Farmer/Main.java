package Farmer;

import Farmer.Action;
import Farmer.FarmerState;
import Farmer.FarmersNode;
import Farmer.FarmersProblem;
import GeneralProblem.Node;
import search.TreeSearch;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        TreeSearch<Action, FarmersProblem> treeSearch = new TreeSearch<>();
        boolean[] liste = new boolean[6];
        for (int i = 0; i < liste.length; i++) {
            liste[i]=true;
        }
        ArrayList<Node<Action>> solve = treeSearch.solve(new FarmersProblem(new FarmersNode(new FarmerState(liste), null, null)));
        solve.forEach(System.out::println);
    }
}

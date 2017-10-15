
import Bidon.*;
import GeneralProblem.Node;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TreeSearch<Action, BidonsProblem> treeSearch = new TreeSearch<>();
        Bidon bidon4 = new Bidon(8,0);
        Bidon bidon3 = new Bidon(9,0);
        ArrayList<Node<Action>> solve = treeSearch.solve(new BidonsProblem(new BidonsNode(new BidonsState(bidon4, bidon3), null, null)));
        solve.forEach(actionNode -> System.out.println(actionNode));
    }
}

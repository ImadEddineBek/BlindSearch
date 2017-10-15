package Bidon;

import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;


public class BidonsProblem extends Problem<Action> {

    public BidonsProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        BidonsNode node = (BidonsNode) currentNode;
        ArrayList<BidonsNode> possibleStates = new ArrayList<>();
        BidonsState currentState = node.getCurrentState();
        if (!((currentState.getB1().getCapacite()==currentState.getB1().getMaxCapacite()||currentState.getB2().getCapacite()==0))){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b2.transferer(b1);
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.transfererB2B1(currentState.getB2(),currentState.getB1()));
            possibleStates.add(bidonsNode);
        }
        if (!(currentState.getB2().getCapacite()==currentState.getB2().getMaxCapacite()||currentState.getB1().getCapacite()==0)){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b1.transferer(b2);
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.transfererB2B1(currentState.getB1(),currentState.getB2()));
            possibleStates.add(bidonsNode);
        }
        if (currentState.getB1().getCapacite()!=0){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b1.vider();
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.viderB1(currentState.getB1()));
            possibleStates.add(bidonsNode);
        }
        if (currentState.getB2().getCapacite()!=0){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b2.vider();
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.viderB2(currentState.getB2()));
            possibleStates.add(bidonsNode);
        }

        if (currentState.getB1().getCapacite()!=currentState.getB1().getMaxCapacite()){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b1.remplir();
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.remplirB1(currentState.getB1()));
            possibleStates.add(bidonsNode);
        }
        if (currentState.getB2().getCapacite()!=currentState.getB2().getMaxCapacite()){
            Bidon b1 = new Bidon(currentState.getB1());
            Bidon b2 = new Bidon(currentState.getB2());
            b2.remplir();
            BidonsState state = new BidonsState(b1,b2);
            BidonsNode bidonsNode = new BidonsNode(state,currentNode,Action.remplirB2(currentState.getB2()));
            possibleStates.add(bidonsNode);
        }
        return possibleStates;
    }

    @Override
    public boolean goalTest(Node<Action> currentNode) {
        return ((BidonsNode) currentNode).getCurrentState().getB1().getCapacite()==2;
    }
}

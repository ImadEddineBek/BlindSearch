package Farmer;

import GeneralProblem.Node;

public class BidonsNode extends Node<Bidon.Action> {
    public BidonsNode(Bidon.BidonsState currentState, Node<Bidon.Action> parentNode, Bidon.Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public Bidon.BidonsState getCurrentState() {
        return (Bidon.BidonsState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "BidonsNode{" +
                "currentState=" + currentState +
                ", action=" + action +
                ", cost=" + cost +
                ", depth=" + depth +
                '}';
    }
}

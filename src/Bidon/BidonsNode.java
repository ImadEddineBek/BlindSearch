package Bidon;

import GeneralProblem.Node;
import GeneralProblem.State;

public class BidonsNode extends Node<Action> {
    public BidonsNode(BidonsState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public BidonsState getCurrentState() {
        return (BidonsState) super.getCurrentState();
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

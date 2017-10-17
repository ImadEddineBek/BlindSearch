package Bidon;

import GeneralProblem.Node;

public class BidonsNode extends Node<Action> {
     BidonsNode(BidonsState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public BidonsState getCurrentState() {
        return (BidonsState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "DetachmentNode{" +
                "currentState=" + currentState +
                ", action=" + action +
                ", cost=" + cost +
                ", depth=" + depth +
                '}';
    }
}

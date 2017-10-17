package Farmer;

import GeneralProblem.Node;

public class FarmersNode extends Node<Action> {
    public FarmersNode(FarmerState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public FarmerState getCurrentState() {
        return (FarmerState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState + " cost " + cost;
    }
}

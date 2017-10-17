package Insects;

import GeneralProblem.Node;

public class InsectsNode extends Node<Action> {
    public InsectsNode(InsectsState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public InsectsState getCurrentState() {
        return (InsectsState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState + "  cost "+cost;
    }
}

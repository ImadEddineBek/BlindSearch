package Detachement;

import GeneralProblem.Node;

public class DetachmentNode extends Node<Action> {
    DetachmentNode(DetachmentState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public DetachmentState getCurrentState() {
        return (DetachmentState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState + "\t\tAction "+action +" cost"+ cost;
    }
}

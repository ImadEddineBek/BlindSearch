package EightQueens;


import GeneralProblem.Node;

public class QueensNode extends Node<Action> {
    public QueensNode(QueensState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public QueensState getCurrentState() {
        return (QueensState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState;
    }
}

package BlackNight;


import GeneralProblem.Node;

public class BlackNode extends Node<Action> {
    public BlackNode(BlackState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public BlackState getCurrentState() {
        return (BlackState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState + " cost "+cost;
    }
}

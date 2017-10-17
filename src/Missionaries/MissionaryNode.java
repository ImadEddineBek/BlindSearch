package Missionaries;


import GeneralProblem.Node;

public class MissionaryNode extends Node<Action>  {
    public MissionaryNode(MissionaryState currentState, Node<Action> parentNode, Action action) {
        super(currentState, parentNode, action);
    }

    @Override
    public MissionaryState getCurrentState() {
        return (MissionaryState) super.getCurrentState();
    }

    @Override
    public String toString() {
        return "" +currentState + " cost "+cost;
    }
}

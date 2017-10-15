package GeneralProblem;

import java.util.ArrayList;

public abstract class Problem<T extends Action>{
    protected Node<T> initialState ;
    public abstract  ArrayList<? extends Node<T>> successorFunction(Node<T> currentNode);
    public abstract  boolean goalTest(Node<T> currentNode);

    public Node<T> getInitialState() {
        return initialState;
    }

    public Problem(Node<T> initialState) {
        this.initialState = initialState;
    }
}

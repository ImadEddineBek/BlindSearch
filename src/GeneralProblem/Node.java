package GeneralProblem;

public class Node<T extends Action> {
    protected State currentState;
    protected Node<T> parentNode;
    protected T action;
    protected double cost;
    protected int depth;

    public Node(State currentState, Node<T> parentNode, T action) {
        this.currentState = currentState;
        this.parentNode = parentNode;
        this.action = action;
        if (parentNode != null) {
            this.cost = parentNode.cost + action.getCost();
            this.depth = parentNode.depth + 1;
        }else {
            this.cost = 0;
            this.depth = 0;
        }
    }

    public Node<T> getParentNode() {
        return parentNode;
    }

    public State getCurrentState() {
        return currentState;
    }

    public T getAction() {
        return action;
    }

    public double getCost() {
        return cost;
    }

    public int getDepth() {
        return depth;
    }
}

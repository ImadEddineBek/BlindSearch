package GeneralProblem;

public class Node<T extends Action> implements Comparable<Node<T>>{
    protected final State currentState;
    private final Node<T> parentNode;
    protected final T action;
    public final double cost;
    protected final int depth;

    protected Node(State currentState, Node<T> parentNode, T action)  {
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

    @Override
    public int compareTo(Node<T> o) {
        return (int) (cost-o.cost);
    }
}

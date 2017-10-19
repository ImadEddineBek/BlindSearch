package EightQueens;


class Action extends GeneralProblem.Action {
        private int x , y;
    public Action(int x , int y, int cost) {
        super(cost);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " occupied  "+x+" "+y +" ";
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

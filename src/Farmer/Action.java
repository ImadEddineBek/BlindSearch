package Farmer;


class Action extends GeneralProblem.Action {
        private final type t ;
        private final Objects o2;
        private final Objects o1;
    public Action(Objects o11 , Objects o21,type t) {
        super(1);
        o2 = o21;
        o1 = o11;
        this.t = t;
    }


    @Override
    public String toString() {
        return "Action{" +
                "t=" + t +
                ", o2=" + o2 +
                ", o1=" + o1 +
                '}';
    }
}

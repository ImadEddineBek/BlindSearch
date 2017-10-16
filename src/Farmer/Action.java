package Farmer;


public class Action extends GeneralProblem.Action {
        private type t ;
        private Objects o2;
        private Objects o1;
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

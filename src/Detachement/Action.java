package Detachement;


public class Action extends GeneralProblem.Action {
        private type t ;
        private Objects o2;
        private Objects o1;
    public Action(Objects o11 , Objects o21, type t) {
        super(1);
        o2 = o21;
        o1 = o11;
        this.t = t;
    }

    @Override
    public String toString() {
        if (o1!=null&&o2!=null) return
                "t=" + t +" "+
                        o2 +
                        o1 +
                        ", cost=" + cost;
        else if (o1!=null)return
                "t=" + t +" "+
                        o1 +
                        ", cost=" + cost;
        else if (o2!=null)return
                "t= " + t +" "+
                        o2 +
                        ", cost=" + cost;
        else return "";
    }
}

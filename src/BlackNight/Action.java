package BlackNight;


class Action extends GeneralProblem.Action {
        private final type t ;
        private final Objects o2;
        private final Objects o1;
    public Action(Objects o11 , Objects o21, type t,int cost) {
        super(cost);
        o2 = o21;
        o1 = o11;
        this.t = t;
    }

    @Override
    public String toString() {
        if (o1!=null&&o2!=null) return
                "t=" + t +" "+
                        o2 +" "+
                        o1 ;
        else if (o1!=null)return
                "t=" + t +" "+
                        o1 ;
        else if (o2!=null)return
                "t= " + t +" "+
                        o2 ;
        else return "";
    }
}

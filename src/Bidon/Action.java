package Bidon;

import static Bidon.type.*;

class Action extends GeneralProblem.Action {
        private final type t ;

    private Action(double cost,type t) {
        super(cost);
        this.t = t;
    }
    static Action viderB1(Bidon b1){
        return new Action(b1.getCapacite(),viderB1);
    }
    static Action viderB2(Bidon b1){
        return new Action(b1.getCapacite(),viderB2);
    }
    static Action remplirB1(Bidon b1){
        return new Action(0,remplirB1);
    }
    static Action remplirB2(Bidon b1){
        return new Action(0,remplirB2);
    }
    static Action transfererB1B2(Bidon b1, Bidon b2){
        return new Action(0,transfererB1B2);
    }
    static Action transfererB2B1(Bidon b1, Bidon b2){
        return new Action(0,transfererB2B1);
    }

    @Override
    public String toString() {
        return "Action{" +
                "t=" + t +
                ", cost=" + cost +
                '}';
    }
}

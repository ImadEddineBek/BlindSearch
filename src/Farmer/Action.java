package Farmer;

import static Bidon.type.*;

public class Action extends GeneralProblem.Action {
        private Bidon.type t ;

    private Action(double cost, Bidon.type t) {
        super(cost);
        this.t = t;
    }
    public static Bidon.Action viderB1(Bidon.Bidon b1){
        return new Bidon.Action(b1.getCapacite(),viderB1);
    }
    public static Bidon.Action viderB2(Bidon.Bidon b1){
        return new Bidon.Action(b1.getCapacite(),viderB2);
    }
    public static Bidon.Action remplirB1(Bidon.Bidon b1){
        return new Bidon.Action(0,remplirB1);
    }
    public static Bidon.Action remplirB2(Bidon.Bidon b1){
        return new Bidon.Action(0,remplirB2);
    }
    public static Bidon.Action transfererB1B2(Bidon.Bidon b1, Bidon.Bidon b2){
        return new Bidon.Action(0,transfererB1B2);
    }
    public static Bidon.Action transfererB2B1(Bidon.Bidon b2, Bidon.Bidon b1){
        return new Bidon.Action(0,transfererB2B1);
    }

    @Override
    public String toString() {
        return "Action{" +
                "t=" + t +
                ", cost=" + cost +
                '}';
    }
}

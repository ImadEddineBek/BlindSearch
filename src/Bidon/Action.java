package Bidon;

import java.util.BitSet;

import static Bidon.type.*;

public class Action extends GeneralProblem.Action {
        private type t ;

    private Action(double cost,type t) {
        super(cost);
        this.t = t;
    }
    public static Action viderB1(Bidon b1){
        return new Action(b1.getCapacite(),viderB1);
    }
    public static Action viderB2(Bidon b1){
        return new Action(b1.getCapacite(),viderB2);
    }
    public static Action remplirB1(Bidon b1){
        return new Action(0,remplirB1);
    }
    public static Action remplirB2(Bidon b1){
        return new Action(0,remplirB2);
    }
    public static Action transfererB1B2(Bidon b1, Bidon b2){
        return new Action(0,transfererB1B2);
    }
    public static Action transfererB2B1(Bidon b2, Bidon b1){
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

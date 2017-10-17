package Bidon;

import GeneralProblem.State;

public class BidonsState extends State {
    private final Bidon b1;
    private final Bidon b2;

     BidonsState(Bidon b1, Bidon b2) {
        this.b1 = new Bidon(b1);
        this.b2 =  new Bidon(b2);
    }

    @Override
    public String toString() {
        return "State { bidon 4 : " + b1.getCapacite() + "  bidon 3 :" + b2.getCapacite() + " }";
    }

     Bidon getB1() {
        return b1;
    }

    Bidon getB2() {
        return b2;
    }

}

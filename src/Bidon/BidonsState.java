package Bidon;

import GeneralProblem.State;

public class BidonsState extends State {
    private Bidon b1;
    private Bidon b2;

    public BidonsState(Bidon b1, Bidon b2) {
        this.b1 = new Bidon(b1);
        this.b2 =  new Bidon(b2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State { bidon 4 : ").append(b1.getCapacite()).append("  bidon 3 :").append(b2.getCapacite()).append(" }");
        return sb.toString();
    }

    public Bidon getB1() {
        return b1;
    }

    public void setB1(Bidon b1) {
        this.b1 = b1;
    }

    public Bidon getB2() {
        return b2;
    }

    public void setB2(Bidon b2) {
        this.b2 = b2;
    }

}

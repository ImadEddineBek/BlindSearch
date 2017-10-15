package Farmer;

import GeneralProblem.State;

public class BidonsState extends State {
    private Bidon.Bidon b1;
    private Bidon.Bidon b2;

    public BidonsState(Bidon.Bidon b1, Bidon.Bidon b2) {
        this.b1 = new Bidon.Bidon(b1);
        this.b2 =  new Bidon.Bidon(b2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State { bidon 4 : ").append(b1.getCapacite()).append("  bidon 3 :").append(b2.getCapacite()).append(" }");
        return sb.toString();
    }

    public Bidon.Bidon getB1() {
        return b1;
    }

    public void setB1(Bidon.Bidon b1) {
        this.b1 = b1;
    }

    public Bidon.Bidon getB2() {
        return b2;
    }

    public void setB2(Bidon.Bidon b2) {
        this.b2 = b2;
    }

}

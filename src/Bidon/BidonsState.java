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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BidonsState that = (BidonsState) o;

        if (b1 != null ? !b1.equals(that.b1) : that.b1 != null) return false;
        return b2 != null ? b2.equals(that.b2) : that.b2 == null;
    }

    @Override
    public int hashCode() {
        int result = b1 != null ? b1.hashCode() : 0;
        result = 31 * result + (b2 != null ? b2.hashCode() : 0);
        return result;
    }
}

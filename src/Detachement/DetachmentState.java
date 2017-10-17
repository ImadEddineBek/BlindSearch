package Detachement;

import GeneralProblem.State;

public class DetachmentState extends State {

    private final int nbSoldasLeft;
    private final int nbSoldasRight;
    private final boolean e1;
    private final boolean e2;
    private final boolean bateau;
    DetachmentState(int nbSoldasLeft, int nbSoldasRight, boolean e1, boolean e2, boolean bateau) {
        this.nbSoldasLeft = nbSoldasLeft;
        this.nbSoldasRight = nbSoldasRight;
        this.e1 = e1;
        this.e2 = e2;
        this.bateau = bateau;
    }

    int getNbSoldasLeft() {
        return nbSoldasLeft;
    }

    boolean hasE1() {
        return e1;
    }

    boolean hasE2() {
        return e2;
    }

    boolean hasBateau() {
        return bateau;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("soldat left : ").append(nbSoldasLeft);
        if (e1)sb.append(" , child 1");
        if (e2)sb.append(" , child 2");
        sb.append("\t\t\t");
        sb.append("\tRight ");
        if (!e1)sb.append("  child 1");
        if (!e2)sb.append(" , child 2");
        sb.append("  soldat right : ").append(nbSoldasRight);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetachmentState that = (DetachmentState) o;

        if (nbSoldasLeft != that.nbSoldasLeft) return false;
        if (nbSoldasRight != that.nbSoldasRight) return false;
        if (e1 != that.e1) return false;
        if (e2 != that.e2) return false;
        return bateau == that.bateau;
    }

    @Override
    public int hashCode() {
        int result = nbSoldasLeft;
        result = 31 * result + nbSoldasRight;
        result = 31 * result + (e1 ? 1 : 0);
        result = 31 * result + (e2 ? 1 : 0);
        result = 31 * result + (bateau ? 1 : 0);
        return result;
    }

    int getNbSoldasRight() {
        return nbSoldasRight;
    }

}

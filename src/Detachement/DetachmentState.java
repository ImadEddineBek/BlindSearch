package Detachement;

import GeneralProblem.State;

public class DetachmentState extends State {

    private int nbSoldasLeft;
    private int nbSoldasRight;
    private boolean e1;
    private boolean e2;
    private boolean bateau;
    public DetachmentState(int nbSoldasLeft, int nbSoldasRight, boolean e1, boolean e2, boolean bateau) {
        this.nbSoldasLeft = nbSoldasLeft;
        this.nbSoldasRight = nbSoldasRight;
        this.e1 = e1;
        this.e2 = e2;
        this.bateau = bateau;
    }

    public int getNbSoldasLeft() {
        return nbSoldasLeft;
    }

    public void setNbSoldasLeft(int nbSoldasLeft) {
        this.nbSoldasLeft = nbSoldasLeft;
    }

    public boolean hasE1() {
        return e1;
    }

    public void setE1(boolean e1) {
        this.e1 = e1;
    }

    public boolean hasE2() {
        return e2;
    }

    public void setE2(boolean e2) {
        this.e2 = e2;
    }

    public boolean hasBateau() {
        return bateau;
    }

    public void setBateau(boolean bateau) {
        this.bateau = bateau;
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

    public int getNbSoldasRight() {
        return nbSoldasRight;
    }

    public void setNbSoldasRight(int nbSoldasRight) {
        this.nbSoldasRight = nbSoldasRight;
    }
}

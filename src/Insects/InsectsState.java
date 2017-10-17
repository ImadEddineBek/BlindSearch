package Insects;

import GeneralProblem.State;

import java.util.Arrays;

public class InsectsState extends State {
    private final boolean[] liste;

     InsectsState(boolean[] liste) {
        this.liste = liste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsectsState that = (InsectsState) o;

        return Arrays.equals(liste, that.liste);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(liste);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiverState : Left ");
        if (liste[0])sb.append(" lombric ");
        if (liste[1])sb.append(" millepatte");
        if (liste[2])sb.append(" sauterelle");

        sb.append("\t");
        sb.append("\tRight ");
        if (!liste[0])sb.append(" lombric ");
        if (!liste[1])sb.append(" millepatte");
        if (!liste[2])sb.append(" sauterelle");

        return sb.toString();
    }

     boolean[] getListe() {
        return liste;
    }

}

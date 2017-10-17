package Insects;

import GeneralProblem.State;

public class InsectsState extends State {
    private final boolean[] liste;

     InsectsState(boolean[] liste) {
        this.liste = liste;
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

package Missionaries;

import GeneralProblem.State;

public class MissionaryState extends State {
    private final boolean[] liste;

     MissionaryState(boolean[] liste) {
        this.liste = liste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiverState : Left ");
        if (liste[0])sb.append(" misssionaryDriver");
        if (liste[1])sb.append(" misssionary");
        if (liste[2])sb.append(" misssionary");
        if (liste[3])sb.append(" indienDriver");
        if (liste[4])sb.append(" indien");
        if (liste[5])sb.append(" indien");
        sb.append("\t");
        sb.append("\tRight ");
        if (!liste[0])sb.append(" misssionaryDriver");
        if (!liste[1])sb.append(" misssionary");
        if (!liste[2])sb.append(" misssionary");
        if (!liste[3])sb.append(" indienDriver");
        if (!liste[4])sb.append(" indien");
        if (!liste[5])sb.append(" indien");
        return sb.toString();
    }

     boolean[] getListe() {
        return liste;
    }

}

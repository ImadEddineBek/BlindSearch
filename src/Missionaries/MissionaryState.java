package Missionaries;

import GeneralProblem.State;

import java.util.Arrays;

public class MissionaryState extends State  {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionaryState that = (MissionaryState) o;

        return Arrays.equals(liste, that.liste);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(liste);
    }

    boolean[] getListe() {
        return liste;
    }


}

package Farmer;

import GeneralProblem.State;

import java.util.Arrays;

public class FarmerState extends State {
    private final boolean[] liste;

     FarmerState(boolean[] liste) {
        this.liste = liste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FarmerState that = (FarmerState) o;

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
        if (liste[0])sb.append(" Farmer");
        if (liste[1])sb.append(" choux");
        if (liste[2])sb.append(" chevre");
        if (liste[3])sb.append(" loup");
        if (liste[4])sb.append(" baton");
        if (liste[5])sb.append(" feu");
        sb.append("\t");
        sb.append("\tRight ");
        if (!liste[0])sb.append(" Farmer");
        if (!liste[1])sb.append(" choux");
        if (!liste[2])sb.append(" chevre");
        if (!liste[3])sb.append(" loup");
        if (!liste[4])sb.append(" baton");
        if (!liste[5])sb.append(" feu");
        return sb.toString();
    }

     boolean[] getListe() {
        return liste;
    }

}

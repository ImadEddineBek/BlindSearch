package Farmer;

import GeneralProblem.State;

public class FarmerState extends State {
    private boolean[] liste;

    public FarmerState(boolean[] liste) {
        this.liste = liste;
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

    public boolean[] getListe() {
        return liste;
    }

    public void setListe(boolean[] liste) {
        this.liste = liste;
    }
}

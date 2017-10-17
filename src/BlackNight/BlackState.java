package BlackNight;

import GeneralProblem.State;

public class BlackState extends State {
    private final boolean[] liste;

     BlackState(boolean[] liste) {
        this.liste = liste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiverState : Left ");
        if (liste[0])sb.append(" Ahmed");
        if (liste[1])sb.append(" Bachir");
        if (liste[2])sb.append(" Chakib");
        if (liste[3])sb.append(" Djallel");
        sb.append("\t");
        sb.append("\tRight ");
        if (!liste[0])sb.append(" Ahmed");
        if (!liste[1])sb.append(" Bachir");
        if (!liste[2])sb.append(" Chakib");
        if (!liste[3])sb.append(" Djallel");
        return sb.toString();
    }

     boolean[] getListe() {
        return liste;
    }

}

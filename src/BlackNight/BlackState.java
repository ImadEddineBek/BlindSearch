package BlackNight;

import GeneralProblem.State;

import java.util.Arrays;

public class BlackState extends State {
    private final boolean[] liste;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackState that = (BlackState) o;

        return Arrays.equals(liste, that.liste);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(liste);
    }

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

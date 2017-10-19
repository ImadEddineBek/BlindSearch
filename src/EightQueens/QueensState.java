package EightQueens;

import GeneralProblem.State;

public class QueensState extends State {
    private final type[][] liste;

    public QueensState(type[][] liste) {
        this.liste = liste;
    }

    public void ocupy(int x , int y){
        liste[x][y]=type.occupied;
        forbidLine(x,y);
        forbidColumn(x,y);
        forbiddiagonal1(x,y);
        forbiddiagonal2(x,y);
    }

    private void forbiddiagonal2(int x, int y) {
        int x1 = x+y , y1 = 0;
        for (int i = 0; i < liste.length; i++,x1--,y1++) {
            if (x1!=x&&y1!=y) try {
                liste[x1][y1]=type.forbidden;
            } catch (Exception e) {
            }
        }
    }

    private void forbiddiagonal1(int x, int y) {
        int x1 = 0 , y1 = y-x;
        for (int i = 0; i < liste.length; i++,x1++,y1++) {
            if (x1!=x&&y1!=y) try {
                liste[x1][y1]=type.forbidden;
            } catch (Exception e) {
            }
        }
    }

    private void forbidColumn(int x, int y) {
        for (int i = 0; i < liste.length; i++) {
            if (i!=x)liste[i][y]=type.forbidden;
        }
    }

    private void forbidLine(int x, int y) {
        for (int i = 0; i < liste.length; i++) {
            if (i!=y)liste[x][i]=type.forbidden;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (type[] types : liste) {
            for (type t : types) {
                if (t.equals(type.empty))sb.append("- ");
                if (t.equals(type.occupied))sb.append("Q ");
                if (t.equals(type.forbidden))sb.append("+ ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public type[][] getListe() {
        return liste;
    }
}

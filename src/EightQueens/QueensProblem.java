package EightQueens;


import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class QueensProblem extends Problem<Action> {
        int n ;
    QueensProblem(Node<Action> initialState,int n) {
        super(initialState);
        this.n = n;
    }
//
    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<QueensNode> queensNodes = new ArrayList<>();
        QueensState currentState = (QueensState) currentNode.getCurrentState();
        type[][] liste = currentState.getListe();
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if (liste[i][j].equals(type.empty)){
                    type[][] newListe = copy(liste);
                    QueensState queensState = new QueensState(newListe);
                    queensState.ocupy(i,j);
                    QueensNode queensNode = new QueensNode(queensState,null,new Action(i,j,+1));
                    queensNodes.add(queensNode);
                }
            }
        }
        return queensNodes;
    }

    private type[][] copy(type[][] liste) {
        type[][] newListe = new type[liste.length][liste.length];
        for (int i = 0; i < liste.length; i++) {
            type[] types = liste[i];
            for (int i1 = 0; i1 < types.length; i1++) {
                type t = types[i1];
                newListe[i][i1] = t;
            }
        }
        return newListe;
    }


    @Override
    public boolean goalTest(Node<Action> currentNode) {
        QueensState currentState = (QueensState) currentNode.getCurrentState();
        int nb = 0;
        for (type[] types : currentState.getListe()) {
            for (type t : types) {
                if (t.equals(type.occupied))nb++;
            }
        }
        return nb>=n;
    }

}


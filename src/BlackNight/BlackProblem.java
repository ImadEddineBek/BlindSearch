package BlackNight;


import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class BlackProblem extends Problem<Action> {

    BlackProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<BlackNode> blackNodes = new ArrayList<>();
        blackNodes.addAll((Collection<? extends BlackNode>) successorFunction1(currentNode));
        blackNodes.addAll((Collection<? extends BlackNode>) successorFunction2(currentNode));
        blackNodes.stream().allMatch(s->s.cost>2);
        return blackNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction1(Node<Action> currentNode) {
        ArrayList<BlackNode> blackNodes = new ArrayList<>();
        BlackState currentState = (BlackState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[4];
        if (boat == liste[0]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[0] = !newList[0];
            newList[4] = !newList[4];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Ahmed, null, t,1));
            blackNodes.add(blackNode);
        }
        if (boat == liste[1]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[1] = !newList[1];
            newList[4] = !newList[4];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Bachir, null, t,2));
            blackNodes.add(blackNode);
        }
        if (boat == liste[2]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[2] = !newList[2];
            newList[4] = !newList[4];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Chakib, null, t,4));
            blackNodes.add(blackNode);
        }
        if (boat == liste[3]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[3] = !newList[3];
            newList[4] = !newList[4];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Dajallel, null, t,10));
            blackNodes.add(blackNode);
        }
        return blackNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction2(Node<Action> currentNode) {
        ArrayList<BlackNode> blackNodes = new ArrayList<>();
        BlackState currentState = (BlackState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[4];
        if (boat == liste[0]&&boat==liste[1]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[0] = !newList[0];
            newList[4] = !newList[4];
            newList[1] = !newList[1];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Ahmed, Objects.Bachir, t,2));
            blackNodes.add(blackNode);
        }
        if (boat == liste[0]&&boat==liste[2]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[0] = !newList[0];
            newList[4] = !newList[4];
            newList[2] = !newList[2];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Ahmed, Objects.Chakib, t,4));
            blackNodes.add(blackNode);
        }
        if (boat == liste[0]&&boat==liste[3]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[0] = !newList[0];
            newList[4] = !newList[4];
            newList[3] = !newList[3];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Ahmed, Objects.Dajallel, t,10));
            blackNodes.add(blackNode);
        }
        if (boat == liste[1]&&boat==liste[2]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[1] = !newList[1];
            newList[4] = !newList[4];
            newList[2] = !newList[2];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Bachir, Objects.Dajallel, t,4));
            blackNodes.add(blackNode);
        }
        if (boat == liste[1]&&boat==liste[3]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[1] = !newList[1];
            newList[4] = !newList[4];
            newList[3] = !newList[3];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Bachir, Objects.Dajallel, t,10));
            blackNodes.add(blackNode);
        }
        if (boat == liste[2]&&boat==liste[3]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[2] = !newList[2];
            newList[4] = !newList[4];
            newList[3] = !newList[3];
            BlackState currentState1 = new BlackState(newList);
            type t;
            if (newList[4]) t = type.rightToLeft;
            else t = type.leftToRight;
            BlackNode blackNode = new BlackNode(currentState1, currentNode, new Action(Objects.Chakib, Objects.Dajallel, t,10));
            blackNodes.add(blackNode);
        }

        return blackNodes;
    }

    @Override
    public boolean goalTest(Node<Action> currentNode) {
        BlackState currentState = (BlackState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        for (boolean b : liste) {
            if (b) return false;
        }
        return true;
    }

}


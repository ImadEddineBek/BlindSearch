package Insects;

import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class InsectsProblem extends Problem<Action> {

     InsectsProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<InsectsNode> insectsNodes = new ArrayList<>();
        insectsNodes.addAll((Collection<? extends InsectsNode>) successorFunction1(currentNode));
        insectsNodes.addAll((Collection<? extends InsectsNode>) successorFunction2(currentNode));
        return insectsNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction1(Node<Action> currentNode) {
        ArrayList<InsectsNode> insectsNodes = new ArrayList<>();
        InsectsState currentState = (InsectsState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[liste.length - 1];
        if (boat) {
            if (liste[0]) {
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0]=false;
                newList[newList.length - 1] = false;
                InsectsState currentState1 = new InsectsState(newList);
                type t;
                t = type.leftToRight;
                InsectsNode insectsNode = new InsectsNode(currentState1, currentNode, new Action(Objects.millepatte, null, t));
                insectsNodes.add(insectsNode);
            }
        }else {
            if (!liste[1]) {
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[1]=true;
                newList[newList.length - 1] = true;
                InsectsState currentState1 = new InsectsState(newList);
                type t;
                t = type.rightToLeft;
                InsectsNode insectsNode = new InsectsNode(currentState1, currentNode, new Action(Objects.lombric, null, t));
                insectsNodes.add(insectsNode);
            }
            if (!liste[2]) {
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[2]=true;
                newList[newList.length - 1] = true;
                InsectsState currentState1 = new InsectsState(newList);
                type t;
                t = type.rightToLeft;
                InsectsNode insectsNode = new InsectsNode(currentState1, currentNode, new Action(Objects.sauterelle, null, t));
                insectsNodes.add(insectsNode);
            }
        }
        return insectsNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction2(Node<Action> currentNode) {
        ArrayList<InsectsNode> insectsNodes = new ArrayList<>();
        InsectsState currentState = (InsectsState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[liste.length - 1];
        if (boat && liste[1] && liste[2]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[1] = false;
            newList[2] = false;
            newList[newList.length - 1] = false;
            InsectsState currentState1 = new InsectsState(newList);
            type t;
            t = type.leftToRight;
            InsectsNode insectsNode = new InsectsNode(currentState1, currentNode, new Action(Objects.lombric, Objects.sauterelle, t));
            insectsNodes.add(insectsNode);
        }
        return insectsNodes;
    }


    @Override
    public boolean goalTest(Node<Action> currentNode) {
        InsectsState currentState = (InsectsState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        for (boolean b : liste) {
            if (b) return false;
        }
        return true;
    }


}


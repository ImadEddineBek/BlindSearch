package Missionaries;


import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class MissionaryProblem extends Problem<Action> {

    MissionaryProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<MissionaryNode> missionaryNodes = new ArrayList<>();
        missionaryNodes.addAll((Collection<? extends MissionaryNode>) successorFunction1(currentNode));
        missionaryNodes.addAll((Collection<? extends MissionaryNode>) successorFunction2(currentNode));
        return missionaryNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction1(Node<Action> currentNode) {
        ArrayList<MissionaryNode> missionaryNodes = new ArrayList<>();
        MissionaryState currentState = (MissionaryState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[6];
        if (boat == liste[0]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[0] = !newList[0];
            newList[6] = !newList[6];
            MissionaryState currentState1 = new MissionaryState(newList);
            type t;
            if (newList[6]) t = type.rightToLeft;
            else t = type.leftToRight;
            MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, null, t));
            if (check(missionaryNode)) {
                missionaryNodes.add(missionaryNode);
            }
        }
        if (boat == liste[3]) {
            boolean[] newList = new boolean[currentState.getListe().length];
            System.arraycopy(liste, 0, newList, 0, liste.length);
            newList[3] = !newList[3];
            newList[6] = !newList[6];
            MissionaryState currentState1 = new MissionaryState(newList);
            type t;
            if (newList[6]) t = type.rightToLeft;
            else t = type.leftToRight;
            MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.indienDriver, null, t));
            if (check(missionaryNode)) {
                missionaryNodes.add(missionaryNode);
            }
        }
        return missionaryNodes;
    }

    private ArrayList<? extends Node<Action>> successorFunction2(Node<Action> currentNode) {
        ArrayList<MissionaryNode> missionaryNodes = new ArrayList<>();
        MissionaryState currentState = (MissionaryState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean boat = liste[6];
        if (boat == liste[0]) {
            if (liste[1]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0] = !newList[0];
                newList[6] = !newList[6];
                newList[1] = !newList[1];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, Objects.misssionary, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }else if (liste[2]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0] = !newList[0];
                newList[6] = !newList[6];
                newList[2] = !newList[2];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, Objects.misssionary, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }
            if (liste[4]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0] = !newList[0];
                newList[6] = !newList[6];
                newList[4] = !newList[4];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, Objects.misssionary, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }else if (liste[5]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0] = !newList[0];
                newList[6] = !newList[6];
                newList[5] = !newList[5];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, Objects.indien, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }
            if (liste[3]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0] = !newList[0];
                newList[6] = !newList[6];
                newList[3] = !newList[3];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.misssionaryDriver, Objects.indienDriver, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }
        }
        if (boat == liste[3]) {
            if (liste[1]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[3] = !newList[3];
                newList[6] = !newList[6];
                newList[1] = !newList[1];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.indienDriver, Objects.misssionary, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }else if (liste[2]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[3] = !newList[3];
                newList[6] = !newList[6];
                newList[2] = !newList[2];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.indienDriver, Objects.misssionary, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }
            if (liste[4]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[3] = !newList[3];
                newList[6] = !newList[6];
                newList[4] = !newList[4];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.indienDriver, Objects.indien, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }else if (liste[5]==boat){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[3] = !newList[3];
                newList[6] = !newList[6];
                newList[5] = !newList[5];
                MissionaryState currentState1 = new MissionaryState(newList);
                type t;
                if (newList[6]) t = type.rightToLeft;
                else t = type.leftToRight;
                MissionaryNode missionaryNode = new MissionaryNode(currentState1, currentNode, new Action(Objects.indienDriver, Objects.indien, t));
                if (check(missionaryNode)) {
                    missionaryNodes.add(missionaryNode);
                }
            }
        }
        return missionaryNodes;
    }

    @Override
    public boolean goalTest(Node<Action> currentNode) {
        MissionaryState currentState = (MissionaryState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        for (boolean b : liste) {
            if (b) return false;
        }
        return true;
    }

    private boolean check(Node<Action> node) {
        MissionaryNode node1 = (MissionaryNode) node;
        boolean[] liste = node1.getCurrentState().getListe();
        int mis = 0, ind = 0;
        for (int i = 0; i < 3; i++) {
            if (liste[i]) mis++;
        }
        for (int i = 3; i < 6; i++) {
            if (liste[i]) ind++;
        }
        boolean more = mis >= ind || mis ==0;
        mis = 0;
        ind = 0;
        for (int i = 0; i < 3; i++) {
            if (!liste[i]) mis++;
        }
        for (int i = 3; i < 6; i++) {
            if (!liste[i]) ind++;
        }
        return (mis >= ind || mis ==0)&& more;
    }

}


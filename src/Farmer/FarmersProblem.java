package Farmer;

import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class FarmersProblem extends Problem<Action> {

    public FarmersProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<FarmersNode> farmersNodes = new ArrayList<>();
        farmersNodes.addAll((Collection<? extends FarmersNode>) successorFunction1(currentNode));
        farmersNodes.addAll((Collection<? extends FarmersNode>) successorFunction2(currentNode));
        farmersNodes.addAll((Collection<? extends FarmersNode>) successorFunction3(currentNode));
        return farmersNodes;
    }
    public ArrayList<? extends Node<Action>> successorFunction1(Node<Action> currentNode) {
        ArrayList<FarmersNode> farmersNodes = new ArrayList<>();
        FarmerState currentState = (FarmerState) currentNode.getCurrentState();
        boolean[] newList = new boolean[currentState.getListe().length];
        boolean[] liste = currentState.getListe();
        System.arraycopy(liste, 0, newList, 0, liste.length);
        newList[0]=!newList[0];
        FarmerState currentState1 = new FarmerState(newList);
        type t;
        if (newList[0])t = type.rightToLeft;
        else t = type.leftToRight;
        FarmersNode farmersNode = new FarmersNode(currentState1,currentNode,new Action(null,null,t));
        if (check(farmersNode)) {
            farmersNodes.add(farmersNode);
        }
        return farmersNodes;
    }
    public ArrayList<? extends Node<Action>> successorFunction2(Node<Action> currentNode) {
        ArrayList<FarmersNode> farmersNodes = new ArrayList<>();
        FarmerState currentState = (FarmerState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean farmer = liste[0];
        for (int i = 1; i < liste.length; i++) {
            if (liste[i]==farmer){
                boolean[] newList = new boolean[currentState.getListe().length];
                System.arraycopy(liste, 0, newList, 0, liste.length);
                newList[0]=!farmer;
                newList[i]=!farmer;
                FarmerState currentState1 = new FarmerState(newList);
                type t;
                if (newList[0])t = type.rightToLeft;
                else t = type.leftToRight;
                FarmersNode farmersNode = new FarmersNode(currentState1,currentNode,new Action(Objects.values()[i],null,t));
                if (check(farmersNode)) {
                    farmersNodes.add(farmersNode);
                }
            }
        }
        return farmersNodes;
    }
    public ArrayList<? extends Node<Action>> successorFunction3(Node<Action> currentNode) {
        ArrayList<FarmersNode> farmersNodes = new ArrayList<>();
        FarmerState currentState = (FarmerState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        boolean farmer = liste[0];
        for (int i = 1; i < liste.length; i++) {
            if (liste[i]==farmer){
                type t;
                if (farmer)t = type.leftToRight;
                else t = type.rightToLeft;
                for (int j = i+1; j < liste.length; j++) {
                    boolean[] newList = new boolean[currentState.getListe().length];
                    System.arraycopy(liste, 0, newList, 0, liste.length);
                    newList[0]=!farmer;
                    newList[i]=!farmer;
                    if (newList[j]==farmer){
                        newList[j]=!farmer;
                        FarmerState currentState1 = new FarmerState(newList);
                FarmersNode farmersNode = new FarmersNode(currentState1,currentNode,new Action(Objects.values()[i],Objects.values()[j],t));
                if (check(farmersNode)) {
                    farmersNodes.add(farmersNode);
                }}
                }
            }
        }
        return farmersNodes;
    }

    @Override
    public boolean goalTest(Node<Action> currentNode) {
        FarmerState currentState = (FarmerState) currentNode.getCurrentState();
        boolean[] liste = currentState.getListe();
        for (boolean b : liste) {
            if (b)return false;
        }
        return true;
    }

    public boolean check(Node<Action> node ){
        FarmersNode node1 = (FarmersNode) node;
        boolean[] liste = node1.getCurrentState().getListe();
        boolean farmer = liste[0];
        for (int i = 1; i < liste.length-1; i++) {
            boolean b = liste[i + 1] != farmer;
            boolean b1 = liste[i] != farmer;
            if (b1 && b) {
                return false;
            }
        }
        return true;
    }

}


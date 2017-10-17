package Detachement;

import GeneralProblem.Node;
import GeneralProblem.Problem;

import java.util.ArrayList;
import java.util.Collection;


public class DetachmentProblem extends Problem<Action> {

     DetachmentProblem(Node<Action> initialState) {
        super(initialState);
    }

    @Override
    public ArrayList<? extends Node<Action>> successorFunction(Node<Action> currentNode) {
        ArrayList<DetachmentNode> detachmentNodes = new ArrayList<>();
        detachmentNodes.addAll((Collection<? extends DetachmentNode>) successorFunction1(currentNode));
        detachmentNodes.addAll((Collection<? extends DetachmentNode>) successorFunction2(currentNode));
        return detachmentNodes;
    }

     private ArrayList<? extends Node<Action>> successorFunction1(Node<Action> currentNode) {
        ArrayList<DetachmentNode> detachmentNodes = new ArrayList<>();
        DetachmentState currentState = (DetachmentState) currentNode.getCurrentState();
        if (currentState.hasBateau()){
            if (currentState.getNbSoldasLeft()>0){
                DetachmentState detachmentState = new DetachmentState(currentState.getNbSoldasLeft()-1, currentState.getNbSoldasRight()+1, currentState.hasE1(),currentState.hasE2(),false);
                DetachmentNode detachmentNode = new DetachmentNode(detachmentState,currentNode,new Action(Objects.soldat,null,type.leftToRight));
                detachmentNodes.add(detachmentNode);
            }
        }else {
            if (!currentState.hasE2()){
                DetachmentState detachmentState = new DetachmentState(currentState.getNbSoldasLeft(), currentState.getNbSoldasRight(), currentState.hasE1(),true,true);
                DetachmentNode detachmentNode = new DetachmentNode(detachmentState,currentNode,new Action(Objects.enfant,null,type.rightToLeft));
                detachmentNodes.add(detachmentNode);
            }
            if (!currentState.hasE1()){
                DetachmentState detachmentState = new DetachmentState(currentState.getNbSoldasLeft(), currentState.getNbSoldasRight(), true,currentState.hasE2(),true);
                DetachmentNode detachmentNode = new DetachmentNode(detachmentState,currentNode,new Action(Objects.enfant,null,type.rightToLeft));
                detachmentNodes.add(detachmentNode);
            }
        }
        return detachmentNodes;
    }
     private ArrayList<? extends Node<Action>> successorFunction2(Node<Action> currentNode) {
        ArrayList<DetachmentNode> detachmentNodes = new ArrayList<>();
        DetachmentState currentState = (DetachmentState) currentNode.getCurrentState();
        if (currentState.hasBateau() && currentState.hasE2() && currentState.hasE1()) {
            DetachmentState detachmentState = new DetachmentState(currentState.getNbSoldasLeft(), currentState.getNbSoldasRight(), false, false, false);
            DetachmentNode detachmentNode = new DetachmentNode(detachmentState, currentNode, new Action(Objects.enfant, Objects.enfant, type.leftToRight));
            detachmentNodes.add(detachmentNode);
        }
        return detachmentNodes;
    }

    @Override
    public boolean goalTest(Node<Action> currentNode) {
        DetachmentState currentState = (DetachmentState) currentNode.getCurrentState();
        return !currentState.hasE1() && !currentState.hasE2() && currentState.getNbSoldasLeft() == 0;
    }



}


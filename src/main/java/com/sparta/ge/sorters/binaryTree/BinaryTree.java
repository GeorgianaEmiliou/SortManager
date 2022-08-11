package com.sparta.ge.sorters.binaryTree;

import com.sparta.ge.exceptions.ChildNotFoundException;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    public int count;
    public int[] sortedTree;

    int numberOfNodes = 1;

    public BinaryTree(int elements){
        rootNode = new Node(elements);
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return getNumberOfNodes(rootNode);
    }

    public void addElement(int element){
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        addNodesToTree(rootNode, elements);

    }

    public boolean findElement(int element){
        Node node = findNode(element);
        if(node != null){
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getRightChild().getValue();
    }


    @Override
    public int[] getSortedTreeAsc() {
        sortedTree = new int[numberOfNodes];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedTree;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    private void addNodeToTree(Node node, int element){
        if(element <= node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
                numberOfNodes = numberOfNodes + 1;
            }
            else{
                addNodeToTree(node.getLeftChild(), element);
            }
        }
        else if(element > node.getValue()){
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
                numberOfNodes = numberOfNodes + 1;
            }
            else{
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private void addNodesToTree(Node node, int[] elements){
        for(int i=0; i<elements.length; i++){
            if(elements[i] <= node.getValue()){
                if(node.isLeftChildEmpty()){
                    node.setLeftChild(new Node(elements[i]));
                }
                else{
                    addNodesToTree(node.getLeftChild(), elements);
                }
            }
            else if(elements[i] > node.getValue()){
                if(node.isRightChildEmpty()){
                    node.setRightChild(new Node(elements[i]));
                }
                else{
                    addNodesToTree(node.getRightChild(), elements);
                }
            }
        }
    }

    private Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()){
                return node;
            }
            else if(element < node.getValue()){
                node = node.getLeftChild();
            }
            else if(element > node.getValue()){
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void sortTreeAsc(Node node){
        if(!node.isLeftChildEmpty()){
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[count] = node.getValue();
        count = count + 1;
        if(!node.isRightChildEmpty()){
            sortTreeAsc(node.getRightChild());
        }
    }

    private int getNumberOfNodes(Node node){
        if(node == null){
            return 0;
        }
        return 1 + getNumberOfNodes(node.getLeftChild()) + getNumberOfNodes(node.getRightChild());
    }

    /*private void insert(Node node, int element){
        node = insertRec(node, element);
    }

    private Node insertRec(Node node, int element){
        if(node == null){
            node = new Node(element);
            return node;
        }
        if(element < node.getValue()){
           node.setLeftChild(insertRec(node.getLeftChild(), element));
        }
        else if(element > node.getValue()){
            node.setRightChild(insertRec(node.getRightChild(), element));
        }
        return node;
    }*/



}


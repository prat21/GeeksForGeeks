package com.geeksforgeeks.datastructure.binarytree;

public class PrintRightView {
    static int printedLevel=0;
    public static void main(String[] args) {
        BinaryTree tree;
        tree = createTree1();
        tree.print(tree.root);

        printRightView(tree.root, 1);

        tree = createTree2();
        tree.print(tree.root);

        printRightView(tree.root, 1);
    }

    static void printRightView(BinaryTree.Node node, int level) {
        if(printedLevel<level){
            System.out.println(node.element);
            printedLevel++;
        }
        level++;
        if(node.right!=null) printRightView(node.right, level);
        if(node.left!=null) printRightView(node.left, level);
    }

    static BinaryTree createTree1(){
        BinaryTree tree = new BinaryTree();
        tree.insertRoot(1);
        tree.insertLeftChild(tree.root, 2);
        tree.insertRightChild(tree.root, 3);
        tree.insertLeftChild(tree.root.left, 4);
        tree.insertRightChild(tree.root.left, 5);
        tree.insertLeftChild(tree.root.right, 6);
        tree.insertRightChild(tree.root.right, 7);
        tree.insertRightChild(tree.root.right.right, 8);
        return tree;
    }

    static BinaryTree createTree2(){
        BinaryTree tree = new BinaryTree();
        tree.insertRoot(1);
        tree.insertLeftChild(tree.root, 2);
        tree.insertRightChild(tree.root, 3);
        tree.insertRightChild(tree.root.left, 4);
        tree.insertLeftChild(tree.root.right, 5);
        tree.insertRightChild(tree.root.right, 6);
        tree.insertLeftChild(tree.root.right.left, 7);
        tree.insertRightChild(tree.root.right.left, 8);
        return tree;
    }
}

class BinaryTree{
    Node root;

    public void insertRoot(int element){
        root = new Node(element, null, null);
    }

    public Node insertLeftChild(Node parent, int element){
        parent.left = new Node(element, null, null);
        return parent.left;
    }

    public Node insertRightChild(Node parent, int element){
        parent.right = new Node(element, null, null);
        return parent.right;
    }

    public void print(Node node){
        if(node==root)
            System.out.println("Root: "+node.element);
        if(node.left!=null || node.right!=null) System.out.print("Children of "+node.element+":");
        if(node.left!=null) System.out.print(" Left Child: "+node.left.element);
        if(node.right!=null) System.out.println(" Right Child: "+node.right.element);
        if(node.left!=null) print(node.left);
        if(node.right!=null) print(node.right);
    }

    static class Node{
        int element;
        Node left;
        Node right;

        public Node(int element, Node left, Node right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }
}

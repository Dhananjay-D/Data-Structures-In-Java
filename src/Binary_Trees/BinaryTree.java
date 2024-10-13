package Binary_Trees;
import java.util.Scanner;

// Implementation of a Binary Tree

public class BinaryTree {

    Node root;

     public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    public void populate(Scanner sc){
        System.out.println("Enter the root node value: ");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }

    public void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Inorder traversal of a Binary Tree:  LEFT - ROOT - RIGHT
    public void inOrder(){
         System.out.println("\nInOrder Traversal of a Binary Tree: ");
         inOrder(root);
    }

    public void inOrder(Node node){
         if(node==null){
             return;
         }

         inOrder(node.left);
         System.out.print(node.value+" -> ");
         inOrder(node.right);
    }

    // Preorder traversal of a Binary Tree: ROOT - LEFT - RIGHT
    public void preOrder(){
         System.out.println("\nPreOrder Traversal of a Binary Tree: ");
         preOrder(this.root);
    }

    public void preOrder(Node node){
         if(node==null){
             return;
         }

         System.out.print(node.value+" ->");
         preOrder(node.left);
         preOrder(node.right);
    }


    // Postorder traversal of a Binary Tree: LEFT - RIGHT - ROOT
    public void postOrder(){
         System.out.println("\nPostOrder Traversal of a Binary Tree: ");
         postOrder(this.root);
    }

    public void postOrder(Node node){
         if(node == null){
             return;
         }

         postOrder(node.left);
         postOrder(node.right);
         System.out.print(node.value+" ->");
    }

    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         BinaryTree bt=new BinaryTree();
         bt.populate(sc);
         bt.preOrder();
         bt.inOrder();
         bt.postOrder();
    }

}

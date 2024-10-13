package Binary_Trees;
// Implementation of Binary Search Trees
public class BinarySearchTree {
    Node root;
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    public void insert(int[] nums){
        if(nums.length==0){
            return;
        }
        root=new Node(nums[0]);
        for(int i=1;i<nums.length;i++){
            insert(root,nums[i]);
        }
    }

    public void insert(Node node,int num){
        if(num<node.value){
            if(node.left==null){
                node.left=new Node(num);
                return;
            }
            insert(node.left,num);
            return;
        } else{
            if(node.right==null){
                node.right=new Node(num);
                return;
            }
            insert(node.right,num);
            return;
        }
    }

    public void inorder(){
        System.out.println("\nInOrder Traversal of a Binary Tree: ");
        inorder(root);
    }

    public void inorder(Node node){
        if(node==null){
            return;
        }

        inorder(node.left);
        System.out.print(node.value+" -> ");
        inorder(node.right);
    }

    public static void main(String[] args){
        BinarySearchTree bst=new BinarySearchTree();
        int[] arr={4,2,1,3,6,5,7};
//        int[] arr={45, 15, 79, 90, 10, 55, 12, 20, 50};
        bst.insert(arr);
        bst.inorder();
    }

}

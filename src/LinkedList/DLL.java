// Implementation of Doubly Linked List

package LinkedList;

import java.util.Scanner;

public class DLL {
    Node head;
    class Node{
        int data;
        Node next,prev;
        public Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else if(head.next==null){
            head.next=newNode;
            newNode.prev=head;
            return;
        }else{
        Node t1=head;
        while(t1.next!=null){
            t1=t1.next;
        }
        newNode.prev=t1;
        t1.next=newNode;
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("linkedList is empty!");
            return;
        }else if(head.next==null){
            head=null;
        }else {
            Node t1 = head.next;
            t1.prev = null;
            head = t1;
        }
    }

    public void removeLast(){
        if(head==null){
            System.out.println("linkedList is empty");
            return;
        }else if(head.next==null){
            head=null;
            return;
        }else{
            Node t1=head;
            while(t1.next!=null){
                t1=t1.next;
            }
            t1=t1.prev;
            t1.next=null;
        }
    }

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println(
                    "1- Enter element to be added first in linkedList\n" +
                    "2- Enter element to be added last in the linkedList\n" +
                    "3- Remove fist linkedList element\n" +
                    "4- Remove last linkedList element\n" +
                    "5- Display elements\n" +
                    "6- Break\n");
            System.out.println("enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){

                case 1: int data2=sc.nextInt();
                    list.addFirst(data2);
                    System.out.println("data added successfully");
                    break;

                case 2: int data3=sc.nextInt();
                    list.addLast(data3);
                    System.out.println("data added successfully");
                    break;

                case 3: list.removeFirst();
                    System.out.println("data removed successfully");
                    break;

                case 4: list.removeLast();
                    System.out.println("data removed successfully");
                    break;

                case 5: list.printList();
                    break;

                case 6: System.exit(0);
            }
        }
    }
}

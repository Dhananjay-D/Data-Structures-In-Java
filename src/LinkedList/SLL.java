// Singly linked list program
package LinkedList;
import java.util.Scanner;
public class SLL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void add(int index,String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else if(head.next==null){
            head.next=newNode;
        }
        else if(index==0){
            newNode.next=head;
            head=newNode;
        }
        else {
            int i=0;
            Node t1=head;
            while(t1.next!=null){
                if(i+1==index){
                    newNode.next=t1.next;
                    t1.next=newNode;
                    break;
                }
                t1=t1.next;
                i++;
            }
            if(i+1==index && t1.next==null){
                newNode.next=t1.next;
                t1.next=newNode;
            }
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else {
            Node lastNode = head.next;
            Node secondLastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }
    }

    public void remove(int index){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        else if(index==0){
            head=head.next;
        }
        else {
            Node temp2 = head.next;
            Node temp1 = head;
            int i = 0;
            while (temp2.next != null) {
                i++;
                if (i == index) {
                    temp1.next = temp2.next;
                    break;
                }
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            i++;
            if (i == index) {
                temp1.next = temp2.next;
            }
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

    public static void main(String[] args){
        SLL list=new SLL();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1- Enter index number and element to add in the linkedList\n" +
                    "2- Enter element to be added first in linkedList\n" +
                    "3- Enter element to be added last in the linkedList\n" +
                    "4- Enter index to be removed from the linkedList\n" +
                    "5- Remove fist linkedList element\n" +
                    "6- Remove last linkedList element\n" +
                    "7- Display elements\n" +
                    "8- Break\n");
            System.out.println("enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){
                case 1: int i=sc.nextInt();
                        String data=sc.next();
                        list.add(i,data);
                        System.out.println("data added successfully");
                        break;

                case 2: String data2=sc.next();
                        list.addFirst(data2);
                        System.out.println("data added successfully");
                        break;

                case 3: String data3=sc.next();
                        list.addLast(data3);
                        System.out.println("data added successfully");
                        break;

                case 4: int j=sc.nextInt();
                        list.remove(j);
                        System.out.println("data removed successfully");
                        break;

                case 5: list.removeFirst();
                        System.out.println("data removed successfully");
                        break;

                case 6: list.removeLast();
                        System.out.println("data removed successfully");
                        break;

                case 7: list.printList();
                        break;

                case 8: System.exit(0);
            }
        }

    }
}


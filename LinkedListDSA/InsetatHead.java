import java.util.*;
public class InsetatHead{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
        static class LinkedList{
            Node head=null;
            Node tail=null;
        void add(int data){
            Node newNode=new Node(data);
              if(head==null){
                head=newNode;
                tail=newNode;
              }else{
                tail.next=newNode;
              }
              tail=newNode;
        }
    
          void Display(){
            Node currentNode=head;
            while(currentNode!=null){
                System.out.println(currentNode.data+" ");
                currentNode=currentNode.next;
            }
          }
          void Inserthead(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.next=head;
                 head=newNode;
            }
          }
        }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.Display();
        ll.Inserthead(12);
        System.out.println("\nAfter Inser at head: ");
        ll.Display();
    }
    }
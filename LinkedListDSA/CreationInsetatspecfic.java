
import java.util.*;
public class CreationInsetatspecfic {
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
          void Specficindex(int data,int index){
                      Node newNode=new Node(data);
                      Node temp=head;
                      for(int i=0;i<index;i++){
                         temp=temp.next;
                      }
                      newNode.next=temp.next;
                      temp.next=newNode;
          }
        
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(12);
        ll.add(14);
        ll.add(56);
        ll.add(67);
        ll.add(34);
        ll.Display();
        System.out.println();
        ll.Specficindex(23, 3);
        ll.Display();
    }
}

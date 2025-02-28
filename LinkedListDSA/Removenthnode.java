import java.util.*;
public class Removenthnode {
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
        void display(){
            Node currentNode=head;
            while(currentNode!=null){
                System.out.println(currentNode.data+" ");
                currentNode=currentNode.next;
            }

        }
        void Remove(int data){
            if(head==null){
                return ;
            }
            if(head.data==data){
                head=head.next;
            }
            if(head==null){
                tail=null;
                return;
            }
            Node current=head;
            if(current.next!=null&&current.next.data!=data){
                current.next=current.next.next;
            }
            if(current.next!=null){
                current=current.next.next;
            }
            if(current.next!=null){
                tail=current;
            }
        }

        
    }
    public static void main(String[] args) {
    
        Scanner Sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
         System.out.println("Enter the number of node");
         int a=Sc.nextInt();
         for(int i=0;i<=a;i++){
            ll.add(Sc.nextInt());
        
         }
         ll.display();
         System.out.print("Enter the element to be remove");
         int remove=Sc.nextInt();
         ll.Remove(remove);
         System.out.print("After removing the Element");
         ll.display();
         
    }
}

import java.util.*;
class A{
    int book;
    String publisher;
    String name;
    int quantity;
    String bookname;
    A(int book,String publisher,String name,int quantity,String bookname){
        this.book=book;
        this.publisher=publisher;
        this.name=name;
        this.quantity=quantity;
        this.bookname=bookname;
    }
}
public class userdefineLinkedList {
    public static void main(String[] args) {
        A p1=new A (2,"rohit","harry",23,"lordharry");
        A p2=new A (3,"rishab","nihal",56,"Spiderman");
        LinkedList<A>ll=new LinkedList<>();
        ll.add(p1);
        ll.add(p2);
        for(A k:ll){
            System.out.println(k.book+" "+k.publisher+" "+k.name+" "+k.quantity+" "+k.bookname);
        }
    }
    
}

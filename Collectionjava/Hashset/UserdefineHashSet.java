import java.util.*;
class A{
    String name;
    int book;
    String publisher;
    String bookname;
    int quantity;
A(String name,int book,String publisher,String bookname,int quantity){
    this.name=name;
    this.book=book;
    this.publisher=publisher;
    this.bookname=bookname;
    this.quantity=quantity;
}
}
public class UserdefineHashSet {
    public static void main(String[] args) {
      A p1 =new A("vishal",5,"Daniel","harry",45);
      A p2 =new A("ankit",8,"rishab","Sipederman",90);
      HashSet<A>hs=new HashSet<>(); 
      hs.add(p1);
      hs.add(p2);
      for(A k:hs){
        System.out.println(k.name+" "+k.book+" "+k.publisher+" "+k.bookname+" "+k.quantity);
      }
    }
}

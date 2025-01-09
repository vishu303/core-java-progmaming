import java.util.*;
class A{
    int a;
    String name;
    A(int a,String name){
        this.a=a;
        this.name=name;
    }
}
public class UserInput {
    public static void main(String[] args) {
        A p1=new A (1,"rajasthan");
        A p2=new A(2,"jammu");
        Vector<A>v=new Vector<>();
        v.addElement(p1);
        v.addElement(p2);
        for(A k:v){
            System.out.println(k.a+" "+k.name);
        }

    }
}

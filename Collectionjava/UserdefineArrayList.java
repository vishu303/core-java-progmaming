import java.util.*;
class A{
    int a;
    String name;
    A(int a, String name ){
        this.a=a;
        this.name=name;
    }
}
public class UserdefineArrayList {
    public static void main(String[] args) {
        A p1 = new A(32,"vishal");
        A p2 =new A(31, "rishab");
        ArrayList<A>al=new ArrayList<>();
        al.add(p1);
        al.add(p2);
        for(A k:al){
            System.out.println(k.a+" "+k.name);
        }
    }
}

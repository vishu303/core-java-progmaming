import java.util.*;
class A{
    int a;
    String name;
    A(int a,String name){
        this.a=a;
        this.name=name;
    }
}
public class UserdefineWrapperclass {
    public static void main(String[] args) {
        A p1=new A(23,"vishal");
        A p2=new A(34,"red");
        ArrayDeque<A>ad=new ArrayDeque<>();
        ad.add(p1);
        ad.add(p2);
        for(A k:ad){
            System.out.println(k.a+" "+k.name);
        }
    }
}

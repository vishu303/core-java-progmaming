import java.util.LinkedHashSet;

class A{
    int a;
    String name;
    A(int a,String name){
        this.a=a;
        this.name=name;
    }
}
public class UserdefineWrapper {
    public static void main(String[] args) {
        A p1=new A(23,"hii");
        A p2=new A(34,"bye");
        LinkedHashSet<A>lhs=new LinkedHashSet<>();
        lhs.add(p1);
        lhs.add(p2);
        for(A k:lhs){
            System.out.println(k.a+" "+k.name);
        }
    }
}

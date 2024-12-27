import java.util.HashMap;
import java.util.Map;

class A{
    int a;
    String name;
    A(int a,String name){
        this.a=a;
        this.name=name;
    }
}
public class UserdefineHashMap {
    public static void main(String[] args) {
        A p1=new A(23,"vishal");
        HashMap<Integer,A>hs= new HashMap<>();
        hs.put(1,"vishal");
        for(Map.Entry<Integer,A> hm:hs.entrySet()){
            A K=hm.getValue();
            System.out.println(hm.getKey()+" "+K.a);

        }

    }
}

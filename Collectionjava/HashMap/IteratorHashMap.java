import java.util.*;
public class IteratorHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(23,"red");
        hm.put(45,"blue");
        hm.put(67,"white");
        hm.put(23,"yellow");
        hm.put(78,"brown");
        Set set=hm.entrySet();
        Iterator itr =set.iterator();
        while(itr.hasNext()){
        Map.Entry e=(Map.Entry)itr.next();
        System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}

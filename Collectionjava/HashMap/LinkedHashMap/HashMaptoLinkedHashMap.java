import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaptoLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new LinkedHashMap<>();
        hm.put(2,"vishal");
        hm.put(3,"rohit");
        hm.put(4,"red");
        hm.put(5,"blue");
        for(Map.Entry hs:hm.entrySet()){
            System.out.println(hs.getKey()+" "+hs.getValue());
        }
    }
}

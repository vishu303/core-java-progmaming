import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMaptoTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>nm=new TreeMap<>();
          nm.put(1,"vishal");
         nm.put(2,"rohit");
         nm.put(3,"goverdhan");
         nm.put(4,"rishab");
         for(Map.Entry<Integer,String>hm:nm.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
         }
    }
}

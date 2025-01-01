import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaptoTreeMap {
    public static void main(String[] args) {
          SortedMap<Integer,String>sm=new TreeMap<>();
         sm.put(1,"vishal");
         sm.put(2,"rohit");
         sm.put(3,"goverdhan");
         sm.put(4,"rishab");
         for(Map.Entry<Integer,String>hm:sm.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
         }
    }
}

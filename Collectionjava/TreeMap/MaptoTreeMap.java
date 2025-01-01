import java.util.Map;
import java.util.TreeMap;

public class MaptoTreeMap {
    public static void main(String[] args) {
        Map<Integer,String>m=new TreeMap<>();
         m.put(1,"vishal");
         m.put(2,"rohit");
         m.put(3,"goverdhan");
         m.put(4,"rishab");
         for(Map.Entry<Integer,String>hm:m.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
         }
    }
}

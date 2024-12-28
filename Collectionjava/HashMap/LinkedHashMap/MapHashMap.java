import java.util.LinkedHashMap;
import java.util.Map;

public class MapHashMap {
    public static void main(String[] args) {
        Map<Integer,String>mp=new LinkedHashMap<>();
        mp.put(1,"vishal");
        mp.put(2,"rohit");
        mp.put(3,"rishab");
        for(Map.Entry hm:mp.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
    }
}

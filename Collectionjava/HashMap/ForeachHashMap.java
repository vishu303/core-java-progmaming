import java.util.HashMap;
import java.util.Map;

public class ForeachHashMap {
    public static void main(String[] args) {
         HashMap<Float,String>hs=new HashMap<>();
         hs.put(23.5f,"vishal");
         hs.put(45.3f,"rohit");
         hs.put(78.1f,"nihal");
        for(Map.Entry hm:hs.entrySet()){
        System.out.println(hm.getKey()+" "+hm.getValue());;
       }
    }
}

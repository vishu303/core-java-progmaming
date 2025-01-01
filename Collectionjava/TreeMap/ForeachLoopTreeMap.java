import java.util.Map;
import java.util.TreeMap;

public class ForeachLoopTreeMap {
    public static void main(String[] args) {
          TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,"blue");
        tm.put(2,"red");
        tm.put(3,"yellow");
        for(Map.Entry<Integer,String>hm:tm.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
    }
}

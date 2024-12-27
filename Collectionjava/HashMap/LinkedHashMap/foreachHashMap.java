import java.util.LinkedHashMap;
import java.util.Map;

public class foreachHashMap {
    public static void main(String[] args) {
         LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"red");
        lhm.put(2,"yellow");
        lhm.put(3,"blue");
        for(Map.Entry hm:lhm.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
    }
}

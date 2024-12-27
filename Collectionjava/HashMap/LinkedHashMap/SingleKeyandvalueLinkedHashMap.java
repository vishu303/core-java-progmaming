import java.util.LinkedHashMap;

public class SingleKeyandvalueLinkedHashMap {
    public static void main(String[] args) {
          LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"red");
        lhm.put(2,"yellow");
        lhm.put(3,"blue");
        System.out.println(lhm.values());
        System.out.println(lhm.keySet());
        System.out.println(lhm.entrySet());
    }
}

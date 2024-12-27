import java.util.*;
public class HeterogenousLinkedHashMap{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"red");
        lhm.put(2,"yellow");
        lhm.put(3,"blue");
        System.out.println(lhm);
    }
}
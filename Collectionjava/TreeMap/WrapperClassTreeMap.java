import java.util.TreeMap;

public class WrapperClassTreeMap{
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,"blue");
        tm.put(2,"red");
        tm.put(3,"yellow");
        System.out.println(tm);

    }
}
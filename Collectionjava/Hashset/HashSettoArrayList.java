import java.util.*;
public class HashSettoArrayList {
    public static void main(String[] args) {
        HashSet hs =new HashSet<>();
        hs.add(34);
        hs.add(78);
        hs.add(80);

        ArrayList<Integer>al=new ArrayList<>(hs);
        al.add(23);
        al.add(45);
        al.add(45);
    System.out.println(al);
   
    }
}

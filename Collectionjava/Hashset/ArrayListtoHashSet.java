import java.util.*;
public class ArrayListtoHashSet {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(45);
    
    HashSet hs =new HashSet<>(al);
    hs.add(34);
    hs.add(78);
    hs.add(80);

    System.out.println(hs);
    }
}

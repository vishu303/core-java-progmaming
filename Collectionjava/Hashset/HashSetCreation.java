import java.util.*;
public class HashSetCreation{
    public static void main(String[] args) {
       HashSet hs=new HashSet<>();
        hs.add(23);
        hs.add("hello");
        hs.add(23.5f);
        hs.add('k');
        System.out.println(hs);
    }
}
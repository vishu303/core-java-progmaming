import java.util.ArrayDeque;
import java.util.HashSet;

public class HashSettoArraydeque {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("hii");
        hs.add("vishal");
          ArrayDeque<String>ad= new  ArrayDeque<>(hs);
        ad.add("blue");
        ad.add("bye");
        ad.add("white");
        System.out.println(ad);
    }
}

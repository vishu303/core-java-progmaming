import java.util.HashSet;
import java.util.TreeSet;

public class HashSetmergeTreeSet {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(23);
        hs.add(89);
        hs.add(67);
        TreeSet<Integer> ts=new TreeSet<>(hs);
          ts.add(90);
          ts.add(23);
          ts.add(65);
          System.out.println(ts);
            
    }
}

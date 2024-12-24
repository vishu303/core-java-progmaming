import java.util.*;
public class HashSetmergeLinkedHashSet {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(23);
        hs.add(67);
        hs.add(90);
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>(hs);
        lhs.add(45);
        lhs.add(87);
        lhs.add(12);
        System.out.println(lhs);

    }
}

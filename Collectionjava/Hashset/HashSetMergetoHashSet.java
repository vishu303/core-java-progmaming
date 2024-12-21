import java.util.*;
public class HashSetMergetoHashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add(34);
        hs.add(45);
        hs.add(34);
        HashSet hs1=new HashSet<>(hs);
        hs1.add(56);
        hs1.add(76);
        hs1.add(12);
        System.out.println(hs1);
    }
    
}

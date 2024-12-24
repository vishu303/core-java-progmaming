import java.util.*;
public class LinkedHashSetmergeHashSet {
 public static void main(String[] args) {
    LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
    lhs.add(45);
    lhs.add(87);
    lhs.add(12);
    HashSet<Integer>hs=new HashSet<>(lhs);
    hs.add(23);
    hs.add(67);
    hs.add(90);
    System.out.println(hs);
 }   
}

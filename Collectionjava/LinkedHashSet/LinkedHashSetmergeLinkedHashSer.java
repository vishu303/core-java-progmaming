import java.util.*;
public class LinkedHashSetmergeLinkedHashSer {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(45);
        lhs.add(78);
        lhs.add(34);
        LinkedHashSet<Integer> lhs1=new LinkedHashSet<>(lhs);
        lhs1.add(78);
        lhs1.add(89);
        lhs1.add(12);

        System.out.println(lhs1);
    }
}

import java.util.*;
public class LinkedHashSetmergeLinkedList {
    public static void main(String[] args) {
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(89);
        lhs.add(78);
        lhs.add(56);
        LinkedList<Integer>ll=new LinkedList<>(lhs);
        ll.add(90);
        ll.add(45);
        ll.add(12);
        System.out.println(ll);
    }
}

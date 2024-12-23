import java.util.*;
public class HashSettoLinkedList {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add(34);
        hs.add(78);
        hs.add(12);
    LinkedList<Integer>ll=new LinkedList<>(hs);
    ll.add(45);
    ll.add(78);
    System.out.println(ll);
    }
}

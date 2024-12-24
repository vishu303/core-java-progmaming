import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListmergeTreeSet {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(34);
        ll.add(90);
        ll.add(12);
        TreeSet<Integer>ts=new TreeSet<>(ll);
        ts.add(34);
        ts.add(67);
        ts.add(9);
        System.out.println(ts);
    }
}

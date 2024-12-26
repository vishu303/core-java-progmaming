import java.util.*;
public class TreeSetmergeHashSetLinkedList {
    public static void main(String[] args) {

        TreeSet<String>ts=new TreeSet<>();
        ts.add("you");
        ts.add("rest");
        ts.add("welcome");
        LinkedHashSet<String>lhs=new LinkedHashSet<>(ts);
        lhs.add("hii");
        lhs.add("bye");
        lhs.add("hello");
        System.out.println(ts);

    }
}

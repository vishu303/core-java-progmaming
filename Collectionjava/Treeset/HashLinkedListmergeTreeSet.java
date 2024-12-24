import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashLinkedListmergeTreeSet {
    public static void main(String[] args) {
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("hii");
        lhs.add("bye");
        lhs.add("hello");
        TreeSet<String>ts=new TreeSet<>(lhs);
        ts.add("you");
        ts.add("rest");
        ts.add("welcome");
        System.out.println(ts);
    }
}

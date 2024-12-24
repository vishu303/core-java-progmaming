import java.util.TreeSet;

public class TreeSetmergeTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(12);
        ts.add(34);
        ts.add(23);
        TreeSet<Integer> ts1=new TreeSet<>(ts);
        ts1.add(23);
        ts1.add(367);
        ts1.add(89);
        System.out.print(ts1);
    }
}

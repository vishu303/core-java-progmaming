import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListmergeTreeset {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(34);
        al.add(90);
        al.add(45);
         TreeSet<Integer> ts=new TreeSet<>(al);
         ts.add(45);
         ts.add(87);
         ts.add(12);
         System.out.println(ts);
    }
}

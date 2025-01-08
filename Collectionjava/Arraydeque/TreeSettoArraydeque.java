import java.util.ArrayDeque;
import java.util.TreeSet;

public class TreeSettoArraydeque {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(12);
        ts.add(45);
        ts.add(12);
           ArrayDeque<Integer>ad= new  ArrayDeque<>(ts);
        ad.add(23);
        ad.add(56);
        ad.add(45);
        System.out.println(ad);
    }
}

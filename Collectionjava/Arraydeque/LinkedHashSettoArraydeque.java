import java.util.ArrayDeque;
import java.util.LinkedHashSet;

public class LinkedHashSettoArraydeque {
    public static void main(String[] args) {
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(90);
        lhs.add(56);
         ArrayDeque<Integer>ad= new  ArrayDeque<>(lhs);
        ad.add(23);
        ad.add(56);
        ad.add(45);
        System.out.println(ad);
    }
}

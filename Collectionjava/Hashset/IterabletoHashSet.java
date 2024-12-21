import java.util.*;
public class IterabletoHashSet {
    public static void main(String[] args) {
        Iterable itr=new HashSet<>();
        itr.add(23);
        itr.add(34);
        itr.add(67);
        System.out.println(itr);
    }
}

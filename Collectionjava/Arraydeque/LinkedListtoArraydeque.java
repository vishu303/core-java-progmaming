import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinkedListtoArraydeque {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(12);
        ll.add(45);
        ll.add(90);
        ArrayDeque<Integer>ad= new  ArrayDeque<>(ll);
        ad.add(23);
        ad.add(56);
        ad.add(45);
        System.out.println(ad);
    }
}

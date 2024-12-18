import java.util.*;
public class LinkedListtoArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
         ll.add(12);
         ll.add(56);
         ll.add(34);
         ll.add(89);
         ArrayList<Integer> al=new ArrayList<>(ll);
         al.add(14);
         al.add(34);
         al.add(76);
         al.add(45);
         System.out.println(al);
    }
}

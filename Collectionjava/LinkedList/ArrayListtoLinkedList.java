import java.util.*;
public class ArrayListtoLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(90);
      LinkedList<Integer>ll=new LinkedList<>(al);
      ll.add(23);
      ll.add(67);
      ll.add(12);
      System.out.println(ll);
    }
}

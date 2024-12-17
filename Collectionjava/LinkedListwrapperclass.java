import java.util.LinkedList;
public class LinkedListwrapperclass {
    public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(23);
        ll.add(45);
        ll.add(12);
        ll.add(78);
        System.out.println(ll);
        LinkedList<String>ll1 = new LinkedList<>();
        ll1.add("hello");
        ll1.add("vishal");
        ll1.add("bye");
        ll1.add("hii");
        System.out.println(ll1);
        LinkedList<Double>ll2 = new LinkedList<>();
        ll2.add(78.9);
        ll2.add(45.5);
        ll2.add(12.3);
        ll2.add(23.4);
        System.out.println(ll2);
    }
}

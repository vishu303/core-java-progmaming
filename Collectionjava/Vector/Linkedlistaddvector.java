import java.util.*;
public class Linkedlistaddvector {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<>();
        ll.add("hii");
        ll.add("bye");
        ll.add("tata");
        ll.add("hello");
        Vector<String>v=new Vector<>(ll);
        v.add("vishal");
        v.add("rohit");
        v.add("rishab");
        v.add("mohit");
        System.out.println(v);
    }
}

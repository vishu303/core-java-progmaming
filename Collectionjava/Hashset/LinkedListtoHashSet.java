import java.util.*;
public class LinkedListtoHashSet {
    public static void main(String[] args) {
     LinkedList<Integer>al=new LinkedList<>();
     al.add(34);
     al.add(45);
     al.add(78);
     HashSet hs=new HashSet<>(al);
     hs.add(34);
     hs.add(78);
     hs.add(12);
     System.out.println(hs);   
    }
}

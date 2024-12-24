import java.util.*;
public class ArrayListmergeLinkedHashSet {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("hii");
        al.add("rishab");
        al.add("vishal");
        LinkedHashSet<String>lhs=new LinkedHashSet<>(al);
        lhs.add("hii");
        lhs.add("bike");
        lhs.add("you");
        System.out.println(lhs);
    }
}

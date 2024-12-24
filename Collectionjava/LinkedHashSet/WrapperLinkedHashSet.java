import java.util.*;
public class WrapperLinkedHashSet{
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet<>();
        lhs.add(23);
        lhs.add("hii");
        lhs.add('k');
        lhs.add(23.4f);
        System.out.println(lhs);
    }
}
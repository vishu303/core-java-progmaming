import java.util.*;
public class ForeachLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(45);
        lhs.add(78);
        lhs.add(34);
        for(int k:lhs){
            System.out.println(k+" ");
        }
    }
}

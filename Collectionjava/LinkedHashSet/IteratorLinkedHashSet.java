import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorLinkedHashSet {
    public static void main(String[] args) {
          LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(45);
        lhs.add(78);
        lhs.add(34);
        Iterator itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}

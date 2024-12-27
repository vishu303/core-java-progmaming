import java.util.*;
public class DescendingIteratorTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(23);
        ts.add(78);
        ts.add(90);
        Iterator itr=ts.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }  
    }
}

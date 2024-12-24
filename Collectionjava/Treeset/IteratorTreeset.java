import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTreeset {
    public static void main(String[] args) {
          TreeSet<String> ts=new TreeSet<>();
        ts.add("hii");
        ts.add("vishal");
        ts.add("bye");
        Iterator itr= ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}

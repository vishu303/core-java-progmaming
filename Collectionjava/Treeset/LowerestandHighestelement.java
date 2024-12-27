import java.util.TreeSet;

public class LowerestandHighestelement {
    public static void main(String[] args) {
         TreeSet<Integer>ts=new TreeSet<>();
   ts.add(23);
   ts.add(78);
   ts.add(90);
   ts.add(12);
   ts.add(567);
   System.out.println("lowerelement "+ts.pollFirst() +" ");
   System.out.println("largestelement "+ts.pollLast() +" ");
    }
}

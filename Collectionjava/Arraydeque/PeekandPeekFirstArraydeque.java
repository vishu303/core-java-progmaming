import java.util.ArrayDeque;

public class PeekandPeekFirstArraydeque {
    public static void main(String[] args) {
          ArrayDeque<String>ad= new  ArrayDeque<>();
        ad.add("red");
        ad.add("vishal");
        ad.add("white");
        ad.peek();
        System.out.println(ad);
        System.out.println();
        
        System.out.println(ad.peekFirst());
        
    }
}

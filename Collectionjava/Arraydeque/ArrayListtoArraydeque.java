import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayListtoArraydeque {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("hii");
        al.add("bye");
        al.add("red");
      ArrayDeque<String>ad= new  ArrayDeque<>(al);
        ad.add("blue");
        ad.add("bye");
        ad.add("white");
        System.out.println(ad);
    }
}

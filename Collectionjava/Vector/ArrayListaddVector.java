import java.util.*;
public class ArrayListaddVector {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(16);
        Vector<Integer>v=new Vector<>(al);
        v.add(34);
        v.add(12);
        v.add(45);
        System.out.println(v);
    }
}

import java.util.ArrayList;

public class ArrayListwrapperclass{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(23);
        al.add(34);
        al.add(56);
        al.add(78);
        System.out.println(al);
        for (int c:al){
            System.out.println(c+" ");
        }
    }
}
import java.util.TreeSet;

public class ForEachTreeSet {
    public static void main(String[] args) {
         TreeSet<Integer> ts=new TreeSet<>();
        ts.add(12);
        ts.add(34);
        ts.add(23);
        for (int i:ts){
         System.out.println(i+" ");
        }
    }
}

import java.util.ArrayDeque;

public class ForeachloopAdeque {
    public static void main(String[] args) {
     ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.add(34);
        ad.add(56);
        ad.add(12);
        ad.add(45);
        for(Integer i:ad){
              System.out.print(i+" ");
        }
    
    
    }
}

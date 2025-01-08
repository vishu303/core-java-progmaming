import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArraydequetoPriorityArray{
    public static void main(String[] args) {
  
        ArrayDeque<Integer>ad= new  ArrayDeque<>();
        ad.add(23);
        ad.add(56);
        ad.add(45);
        PriorityQueue<Integer>pq=new PriorityQueue<>(ad);
        pq.add(23);
        pq.add(12);
        pq.add(34);
        System.out.println(pq);
        }
}
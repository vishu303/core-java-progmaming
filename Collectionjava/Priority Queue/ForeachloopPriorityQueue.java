import java.util.PriorityQueue;
import java.util.Queue;

public class ForeachloopPriorityQueue {
    public static void main(String[] args) {
    Queue<Integer>q = new PriorityQueue<>();
    q.add(34);
    q.add(78);
    q.add(90);
     for(int i:q){
        System.out.println(i+" ");
     }
    }
}

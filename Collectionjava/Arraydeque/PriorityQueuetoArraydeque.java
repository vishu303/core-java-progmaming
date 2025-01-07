import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueuetoArraydeque {
    public static void main(String[] args) {
        PriorityQueue<String>pq=new ArrayDeque<>();
        pq.add("hii");
        pq.add("vishal");
        pq.add("bye");
        System.out.print("Arraydeque"+pq);
    
    }
}

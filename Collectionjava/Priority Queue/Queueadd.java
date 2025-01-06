import java.util.PriorityQueue;
import java.util.Queue;

public class Queueadd{
    public static void main(String[] args) {
      Queue<Integer>q = new PriorityQueue<>();
        q.add(23);
        q.add(2);
        q.add(78);
        System.out.println(q);
        Queue<Integer>q1 = new PriorityQueue<>(q);
        q1.add(27);
        q1.add(56);
        q1.add(72);
        System.out.println(q1);
        


    }
}
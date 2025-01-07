import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArraydequetoPriorityArray{
    public static void main(String[] args) {
        
        ArrayDeque<Integer>ad= new  PriorityQueue<>();
        ad.add(23);
        ad.add(56);
        ad.add(45);
        System.out.println("priorityQueue"+ad);
    }
}
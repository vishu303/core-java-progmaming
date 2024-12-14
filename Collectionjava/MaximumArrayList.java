import java.util.*;
public class MaximumArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int Max = Integer.MIN_VALUE; 
        ArrayList<Integer> al = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > Max) {
                Max = al.get(i);
            }
        }
        
        System.out.println("Maximum value in the ArrayList: " + Max);
    }
}

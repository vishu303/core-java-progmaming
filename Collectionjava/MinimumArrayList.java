import java.util.ArrayList;
import java.util.Scanner;

public class MinimumArrayList {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        int Mim = al.get(0);
        for (int i = 0; i < al.size(); i++) {
        
            if (al.get(i) < Mim) {
                Mim = al.get(i);
            }
        }
        
        System.out.println("Minimum " + Mim);
    }
}

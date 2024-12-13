import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
         System.out.print("Enter the size of ArrayList");
         int n=sc.nextInt();
         ArrayList<Integer>al= new ArrayList<>();
         for(int i=0;i<n;i++){
           int x=sc.nextInt();
         al.add(x); 
    }
    int sum=0;
    for(int i=0;i<al.size();i++){
        sum=sum+al.get(i);

    }
       System.out.print("sum of ArrayList"+sum);
  }
}
import java.util.*;
public class FactorialArrayList{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter the size of ArrayList");
         int n=sc.nextInt();
         ArrayList<Integer>al= new ArrayList<>();
         for(int i=0;i<n;i++){
           int x=sc.nextInt();
         al.add(x);   
         }
         int p=1;
         for(int i=0;i<al.size();i++){
            p=p*al.get(i);
         }
             System.out.print("factorial"+p);
    }
}
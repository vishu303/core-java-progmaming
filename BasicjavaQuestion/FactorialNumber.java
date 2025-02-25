import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=sc.nextInt();
     int fact=1;
     int temp=num;
     while(num>=1){
        fact=fact*num;
        num--;
     }
     System.out.println("Factorial"+temp+"is"+fact);
    }
}

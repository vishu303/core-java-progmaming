import java.util.*;
public class Pefrectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        int i=1;int sum=0;
        while(i<num){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
            
            if(num==sum){
                System.out.println("prefect number");
            }
            else{
                System.out.println("not prefect");
            }
        
    }
}

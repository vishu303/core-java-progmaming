import java.util.*;
public class PallindromeArrayList {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size ArrayList");
       int n=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i< n;i++){
            int x=sc.nextInt();
            al.add(n);
        }
        for(int i=0;i<al.size();i++){
            int num=0;int temp=al.get(i);
             while(temp>0){
                int a=temp%10;
                num=num*10+a;
                temp=temp/10;
             }
             if(num==al.get(i)){
                System.out.print(al.get(i));
             }
        }
     
    }
}

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
             ArrayList<Integer>al1=new ArrayList<>();
       al1.add(1);
       al1.add(2);
       al1.add(3);
       System.out.println(al1);
       for(int i=al1.size()-1;i>=0;i--){
           System.out.print(al1.get(i));
       }
       
    }
}

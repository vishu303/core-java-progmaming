import java.util.Stack;

public class Evennumbercount {
    public static void main(String[] args) {
        int count=0;
        Stack<Integer>s=new Stack<>();
        s.add(23);
        s.add(12);
        s.add(90);
        s.add(34);
       for(int i=0;i<s.size();i++){
        if(s.get(i)%2==0){
            count++;
            System.out.println(s.get(i));
        }
       }
       System.out.println("Total even number"+count);
    }
}

import java.util.Stack;

public class EvenNumberStack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.add(23);
        s.add(12);
        s.add(98);
        for(int i=0;i<s.size();i++){
            if(s.get(i)%2==0){
                System.out.println(s.get(i));
            }
        }
    }
}

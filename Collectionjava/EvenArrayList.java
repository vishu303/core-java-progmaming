import java.util.ArrayList;

public class EvenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>al= new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(76);
        al.add(23);
        al.add(90);
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
                System.out.println("Even number is "+al.get(i)+" ");
            }
        }

    }
}

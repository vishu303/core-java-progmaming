import java.util.ArrayList;

public class CountevenArrayList {
       public static void main(String[] args) {
        ArrayList<Integer>al= new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(76);
        al.add(23);
        al.add(90);
        int count=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
                count++;
                System.out.println("Even number is "+al.get(i)+" ");
            }
            System.out.print(count);
        }

    }
}

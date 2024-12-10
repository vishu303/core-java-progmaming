import java.util.ArrayList;

public class OddArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(22);
        al.add(12);
        al.add(87);
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2!=0){
                System.out.println("Odd number id is"+al.get(i)+" ");
            }
        }
    }
}

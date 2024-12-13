import java.util.*;
public class DuplicateArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      ArrayList<Integer>al=new ArrayList<>();
      al.add(23);
      al.add(45);
      al.add(23);
      al.add(67);
      System.out.println(al);
      for(int i=0;i<al.size();i++){
        for(int j=i+1;j<al.size();j++){
            if(al.get(i)==al.get(j)){
                System.out.print("Duplicate number"+al.get(i));
            }
        }
      }
    }
}

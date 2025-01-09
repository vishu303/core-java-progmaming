import java.util.Vector;

public class PredefineMethodgetandsize {
    public static void main(String[] args) {
      Vector<Integer> v=new Vector<>();
        v.addElement(23);
        v.addElement(34);
        v.addElement(14);
        System.out.println(v.size());
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}

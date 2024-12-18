import java.util.*;
public class forwardandBackedList {
    public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>();
         ll.add(234);
         ll.add(678);
         ll.add(56);
         ll.add(23);
         //forward//
         ListIterator litr=ll.listIterator();
         while(litr.hasNext()){
            System.out.println(litr.next()+" ");
         }
         //backward//
         System.out.println();
         while(litr.hasPrevious()){
            System.out.println(litr.previous());
         }
    }
}

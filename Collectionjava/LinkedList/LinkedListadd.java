import java.util.*;
public class LinkedListadd{
    public static void main(String[] args) {
        //al1-------------------al2//
        LinkedList<Integer>al=new LinkedList<>();
        al.add(12);
        al.add(45);
        al.add(23);
        LinkedList<Integer>al1=new LinkedList<>(al);
        al1.add(14);
        al1.add(76);
        al1.add(29);
        System.out.println(al1);
          //al3----------------------al4//
        LinkedList<Integer>al3=new LinkedList<>();
        al3.add(65);
        al3.add(40);
        al3.add(89);
        LinkedList<Integer>al4=new LinkedList<>(al3);
        al4.add(34);
        al4.add(98);
        al4.add(27);
        System.out.println(al4);

    }

}
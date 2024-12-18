import java.util.*;

class A {
    int agarbati;
    String choclate;
    String oil;
    int quantity;
    int number;
    String name;
    int price;
    
    A(int agarbati, String choclate, String oil, int quantity, int number, String name, int price) {
        this.agarbati = agarbati;
        this.choclate = choclate;
        this.oil = oil;
        this.quantity = quantity;
        this.number = number;
        this.name = name;
        this.price = price;
    }
}

public class BlinketUserdefine {
    public static void main(String[] args) {
        
        A p1 = new A(5, "5star", "blackoil", 10, 123456, "Vishal", 100);
        A p2 = new A(3, "KitKat", "coconut oil", 5, 789012, "Amit", 50);
        A p3 = new A(7, "Dairy Milk", "mustard oil", 20, 456789, "Rohan", 150);


        ArrayList<A> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);

    
        for (A k : al) {
            System.out.println(k.agarbati + " " + k.choclate + " " + k.oil + " " + k.quantity + " " +
                    k.number + " " + k.name + " " + k.price);
        }
    }
}

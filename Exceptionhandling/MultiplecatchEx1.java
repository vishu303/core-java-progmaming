import java.util.*;
public class MultiplecatchEx1{
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic handle");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array handle");
        }
        catch(Exception ex){
            System.out.println("handle");
        }

    }
}
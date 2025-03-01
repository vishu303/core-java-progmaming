class A extends RuntimeException{
    public A(String s){
        System.out.println(s);
    }
}
class B {
    static void show(int age){
        if(age<18){
            throw new A ("not valid for vote");
        }
        else{
            System.out.println("not valid");
        }
    }
}
public class ThrowExceptioncase2 {
    public static void main(String[] args) {
        B.show(12);
    }
}

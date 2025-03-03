class A extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("child class");
        }
    }
}
public class Threadcase2 {
    public static void main(String[] args) {
        A p=new A();
        p.start();
        for(int i=0;i<=3;i++){
            System.out.println("Main class");
        }
    }
}

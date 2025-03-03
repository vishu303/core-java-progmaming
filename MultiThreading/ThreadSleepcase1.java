class A extends B{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+" ");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+" ");
        }
    }
}
public class ThreadSleepcase1 {
    public static void main(String[] args) {
        A p=new A();
        p.start();
        B p1=new B();
        p1.start();
    }
}

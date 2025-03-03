
    class A extends Thread{
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println(i+" ");
            }
        }
    }
    public class Threadcase1 {
        public static void main(String[] args) {
            A p=new A();
            p.start();
            for(int i=0;i<=5;i++){
                System.out.println(2*i+" ");
            }
        }
    }
    
    


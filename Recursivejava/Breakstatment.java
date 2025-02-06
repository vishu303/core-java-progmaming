class A{
    static void  show(){
     for(int i=0;i<=10;i++){
        if(i==7){
            break;
        }
        System.out.println(i+" ");
     }
     System.out.println("hello");
    }
}
public class Breakstatment{
public static void main(String[] args) {
    A.show();
}
}
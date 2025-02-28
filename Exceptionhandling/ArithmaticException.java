
public class ArithmaticException {
    public static int divide(int a,int b){
      try{ 
         return a / b;
      }
      catch(ArithmeticException e){
        System.out.println(e);
           return -1 ;
      }
    }
    public static void main(String[] args) {
        int[] a={12,34,56,7};
        int[] b={2,3,0,6};
        for(int i=0;i<=a.length;i++){
            System.out.println(divide(a[i],b[i])+" ");
        }
        System.out.println("good work");
    }
}

public class ExceptioninMultiMethod {
    public static void level1(){
       level4();
    }
    public static void level2(){
       try{ int a[]=new int[5];
        a[5]=10;
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
       }
    }
    public static void level3(){
        level2();
    }
    public static void level4(){
        level3();
    }
    public static void main(String[] args) {
       ExceptioninMultiMethod.level1();
    }
}

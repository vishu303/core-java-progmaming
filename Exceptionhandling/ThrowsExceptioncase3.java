public class ThrowsExceptioncase3 {
    void show()throws Exception{
        throw new Exception("handle");
    }
    public static void main(String[] args) {
        ThrowsExceptioncase3 t=new ThrowsExceptioncase3();
        try{
            t.show();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

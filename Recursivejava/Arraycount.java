public class Arraycount {
   public static void printn(int arr[],int index,int count){
    if(arr.length==index){
        System.out.println(count);
        return;
    }
    System.out.println(arr[index]+" ");
    printn(arr,index+1,count+1);
    

   }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printn(a,0,0);
    }
}

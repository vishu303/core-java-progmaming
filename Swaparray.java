public class Swaparray {
 public static void display(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
 }
 static void swap(int a[]){
    int temp =a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
 } 
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        display(a);
        swap(a);
        display(a);
    }
}

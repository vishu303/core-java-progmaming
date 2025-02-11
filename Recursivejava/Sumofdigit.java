public class Sumofdigit {
 public static int sum(int n){
    if(n>=0 && n<=9){
        return n;
    }
    int Small=sum(n/10);
    int add =Small+n%10;
    return add;
 }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}

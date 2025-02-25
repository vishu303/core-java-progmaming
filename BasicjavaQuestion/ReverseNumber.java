public class ReverseNumber {
    public static void main(String[] args) {
        int num=234, rem=0,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.print(sum+" ");
    }
}

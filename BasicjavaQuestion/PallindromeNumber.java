public class PallindromeNumber {
    public static void main(String[] args) {
        int num=12321,rem=0,sum=0;
          int temp=num;
          while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
          }
          if(temp==sum){
            System.out.println(temp+"pallindrome");
          }
          else{
            System.out.println(temp+"not pallindrome");
          }
    }
}

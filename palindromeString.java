public class palindromeString {
    public static void main(String[] args) {
        String s="abca";
        char ch[]=s.toCharArray();
        char ch1[]=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            ch[i]=ch1[ch.length-1-i];
        }
        int count=0;
        for(int i=0;i<ch.length;i++){
          for(int j=i;j<=i;j++){
              if(ch[i]==ch1[j]){
                count++;
              }
              else{
                break;
              }
          }
        }
        if(count==ch.length){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}

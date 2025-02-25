public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, rem = 0;
        int temp = num;

        while (num > 0) {
            rem = num % 10; //get the last digit
            sum = sum + rem * rem * rem; // Add cube of the digit
            num = num / 10; // Remove the last digit
        }

        
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}

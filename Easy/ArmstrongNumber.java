import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int tempNum = num; 
        int digits = 0;
       if (num == 0) {
            digits = 1;
        } else {
            while (tempNum != 0) {
                tempNum /= 10;
                digits++; 
            }
        }
        
        int calculatedSum = 0;
        tempNum = original; 
        while (tempNum > 0) {
            int digit = tempNum % 10;
            int powerResult = 1;
            for (int i = 0; i < digits; i++) {
                powerResult *= digit;
            }
            calculatedSum += powerResult;
            tempNum /= 10;     }
        if (calculatedSum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}

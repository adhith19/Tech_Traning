package mod1;
import java.util.Scanner;
public class PrimeNumber {
	   public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number: ");
		        int num = sc.nextInt();
		        if (isPrime(num)) {
		            System.out.println(num + " is a Prime Number");
		        }
		        else {
		            System.out.println(num + " is NOT a Prime Number");
   }
	   }
	   static boolean isPrime(int num) {
	        if (num <= 1) return false;

	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                return false; 
	            }
	        }

	        return true; 
	    }
	}

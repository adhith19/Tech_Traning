package mod1;
import java.util.Scanner;
public class natureNumber {
	
   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int result = sumofNatural(num);
	        System.out.println("sum of number is " + num +" is"+ result);
	        
   }
   static int sumofNatural(int n) {
	   int sum = 0;
	        for (int i=1;i<=n;i++)
	        {
	        	sum+= i;
	        }
	   return sum;
	    }
	}



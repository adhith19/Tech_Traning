package mod1;
import java.util.*;
public class AvgNumberList {


	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = in.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = in.nextInt();
	        }

	        double sum = 0;

	        for (int i = 0; i < n; i++) {
	            // only add if number is positive (example conditional)
	            if (arr[i] >= 0) {
	                sum += arr[i];
	            }
	        }

	        double average = sum / n; // divide by total numbers

	        System.out.println("Average = " + average);
	    }
	}



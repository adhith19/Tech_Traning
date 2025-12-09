package mod1;
import java.util.Scanner;
import java.util.Arrays;

public class largestNum {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		int[] arr2 = new int[n];
		
		System.out.println("Enter the array element");
		for(int i =0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
		   int largest = FindLarge(arr2);
		   System.out.println("Largest number in the array is: " + largest);
		
	}
static int FindLarge(int[] arr2) {
	int max = arr2[0];
	for(int n:arr2) {
		if(n>max) {
			max=n;
			
		}
	}
	System.out.println(arr2);
	return max;
	
}
}

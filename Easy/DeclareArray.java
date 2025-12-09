package mod1; 
import java.util.Scanner;
public class DeclareArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr1={1,2,3,4};
    System.out.println("enter the size  of array ");
    int n =sc.nextInt();
    int[] arr2=new int[n];
     System.out.println("Enter the value of array");
    for (int i=0;i<n;i++){
         arr2[i]=sc.nextInt();   
    }
    for (int i=0;i<n;i++){
    System.out.println(arr2[i]);   
    }
 }    
}
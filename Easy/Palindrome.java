package mod1;
import java.util.Scanner;
public class Palindrome {
	 public static void main(String [] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String a = sc.nextLine();
		 String rev ="";
		 for (int i = 0; i< a.length() ; i++) {
			 rev= a.charAt(i)+rev;
		
		 }
		 if(a.equals(rev)) {
			 System.out.println("It is Palindrome");
		 }
		 else {
			 System.out.println("It is   Not palindrome");
		 }
		 System.out.println(rev);
}
}
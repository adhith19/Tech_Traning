package mod1;
//reverse string
public class ReverseInt {
 public static void main(String [] args) {
	 String a = "malayalam";
	 String rev ="";
	 for (int i = 0; i< a.length() ; i++) {
		 rev= a.charAt(i)+rev;
	
	 }
	 if(a.equals(rev)) {
		 System.out.println("true");
	 }
	 else {
		 System.out.println("false");
	 }
	 System.out.println(rev);
	 
 }
 
}

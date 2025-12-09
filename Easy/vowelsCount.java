package mod1;

public class vowelsCount {
 public static void main(String[] args) {
	 String s = "hello welcome";
	 System.out.println(countVowels(s));
 }
static int countVowels(String str) {
	int count =0;
 for(int i = 0;i< str.length();i++) {
	 char ch = str.charAt(i);
	 if("aeiou".contains(ch+"")){
		 count++;
	 }
 }
	return count; 
	
}
}

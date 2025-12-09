package mod1;
import java.util.Scanner;
public class WordCount {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        int wordCount = 0;
	        boolean inWord = false; 
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch != ' ' && !inWord) {
	                wordCount++;
	                inWord = true;
	            } else if (ch == ' ') {
	                 inWord = false;
	            }
	        }
	        System.out.println("Number of words: " + wordCount);
	    }
	}


package mod1;


	import java.util.*;
	public class RemoveDuplicatesSet {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        HashSet<Integer> set = new HashSet<>();
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            set.add(sc.nextInt());
	        }
	        System.out.println("List without duplicates: " + set);
	    }
	}


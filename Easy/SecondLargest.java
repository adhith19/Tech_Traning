package mod1;
import java.util.Arrays;
public class SecondLargest {
public static void main(String[] args) {
	int[] number = {4,7,5,12,8};
	int secondbig = findSecondBig(number);
	System.out.println("Second largest" +secondbig);
}
public static int findSecondBig(int[] array) {
	Arrays.sort(array);
	int Big = array[array.length-1 ];
	for(int i = array.length - 2; i>=0;i++) {
		if(array[i] != Big) {
			return array[i];
			
		}
	}
	return Big;
}
}

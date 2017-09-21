//1.4.8 Write a program to determine the number pairs of values in an input file that are equal. 
//If your first try is quadratic, think again and use Arrays.sort() to develop a linearithmic solution.
import edu.princeton.cs.algs4.BinarySearch;
import java.util.Arrays;

public class NumberPairs {
	
	public static int[] findPairs(int[] a, int[] b) {
		int[] doubles = new int[a.length];
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++) {
			if(BinarySearch.indexOf(b, a[i]) != -1) {
				doubles[i] = a[i];
			}
		}
		return doubles;
	}
	
	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		int[] matches = findPairs(array1, array2);
		System.out.println(matches);
	}

}

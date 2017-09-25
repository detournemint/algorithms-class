import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class FourSum {

	public static int count(int[] a) {
		int N = a.length;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					for (int l = 0; l < a.length; l++) {
						if(a[i] + a[j] + a[k] + a[l] == 0) {
							count++;
						}
						
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a = In.readInts(args[0]);	
        StdOut.println(count(a));
	}
}

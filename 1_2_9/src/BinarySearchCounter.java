/*
 * Instrument Binary Search(page47) to use a Counter to count the total number 
 * of keys examined during all searches and then print the total 
 * after all searches are complete. 
 * Hint : Create a Counter in main() and pass it as an argument to rank().
 */

import java.util.Arrays;

import edu.princeton.cs.algs4.Counter;

public class BinarySearchCounter{
	public static int rank(int key, int[] a, Counter c) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			c.increment();
			int mid = lo + (hi - lo)/2;
			if (key < a[mid]) hi = mid -1;
			if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		Counter counter = new Counter("searchCounter");
		
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (rank(key, whitelist, counter) < 0) {
				StdOut.println(key);
				StdOut.println(counter.tally());
			}
		}
	}
}

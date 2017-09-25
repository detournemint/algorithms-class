
public class ThreeSumFaster {
	
	public static int count(int[] array) {
		int count = 0;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[i] + array[i+1] + array[j] == 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,-2,0};
		StdOut.println(count(input));
	}

}

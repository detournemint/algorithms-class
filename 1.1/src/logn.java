public class logn {
	
	public static int logfact(int N) {
		if (N==1 || N==0) {
			return 1;
		}
		return Math.log(logfact(N-1) * N;
	}
	public static void main(String[] args)
    {
		System.out.println(logfact(4));
    }
}
import java.io.IOException;

public class sample {

	public static void main(String[] args) throws IOException {
		int M = 6;
		int N = 6;
		boolean[][] a;
		a = new boolean[M][N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				if (a[i][j] == true)
					System.out.println(i+" "+j+" *");
				else
					System.out.println(i+" "+j+" -");
				
	}
	
	public static boolean equal(double x, double y) {
		return (0.0 < x && x < 1.0)  && (0.0 < y && y < 1.0);
	}

}

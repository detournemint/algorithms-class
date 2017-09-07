import edu.princeton.cs.algs4.Interval1D;

public class IntervalOneDee {
	public static void main(String[] args) {
		Interval1D[] intervals = new Interval1D[args.length - 1];
		int N = Integer.parseInt(args[0]);
		for (int i = 1; i < N; i = i + 2)
        {
           double x = Double.parseDouble(args[i]);
           double y = Double.parseDouble(args[i+1]);
           intervals[i] = new Interval1D(x, y);
        }
		for(int i = 0; i < args.length - 1; i++) {
			for(int j = 0; j < args.length - 1; j++) {
				if (intervals[i].intersects(intervals[j]))
					System.out.println(intervals[i]);
					System.out.println(intervals[j]);
			}
		}
	}

}

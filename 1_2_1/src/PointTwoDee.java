import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Point2D;



public class PointTwoDee {
	public static void main(String[] args) {
		double xlo = Double.parseDouble(args[0]);
		double xhi = Double.parseDouble(args[1]);
		double ylo = Double.parseDouble(args[2]);
		double yhi = Double.parseDouble(args[3]);
		int T = Integer.parseInt(args[4]);
		Interval1D x = new Interval1D(xlo, xhi);
		Interval1D y = new Interval1D(ylo, yhi);
		Interval2D box = new Interval2D(x, y);
		box.draw();
		Counter c = new Counter("hits");
		for (int t = 0; t < T; t++)
		{
			double a = Math.random();
			double b = Math.random();
			Point2D p = new Point2D(a, b);
			if (box.contains(p)) c.increment();
			else                 p.draw();
		}
		StdOut.println(c);
		StdOut.println(box.area());
//		int N = Integer.parseInt(args[0]);
//		double greatestDistance = 0.0;
//		Point2D[] points = new Point2D[N];
//		for(int i=0; i<N; i++) {
//			double x = Math.random();
//			double y = Math.random();
//			Point2D point = new Point2D(x, y);
//			points[i] = point;
//			point.draw();
//		}
		

	}

}

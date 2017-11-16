
public class Quick {
	
	private Quick() {
		
	}
	
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length -1);
		assert isSorted(a);
	}
	
	public static void sort2Distinct(Comparable[] a) {
		int lt = 0, gt = a.length - 1;
		int i = 0;
		while(i <= gt) {
			int cmp = a[i].compareTo(a[lt]);
			if (cmp < 0) exch(a, lt++, i++);
			if (cmp > 0)	 exch(a, i, gt--);
			else i++;
		}
	}
	
	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi<=lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
		assert isSorted(a, lo, hi);
	}
	
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi+1;
		Comparable v = a[lo];
		while (true) {
			while (less(a[++i], v)) {
				if (i == hi) break;
			}
			while (less(v, a[--j])) {
				if (j == lo) break;
			}
			if (i >= j ) break;
			
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	private static Comparable select(Comparable[] a, int k) {
		if (k < 0 || k >= a.length) {
            throw new IllegalArgumentException("index is not between 0 and " + a.length + ": " + k);
        }
        StdRandom.shuffle(a);
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int i = partition(a, lo, hi);
            if      (i > k) hi = i - 1;
            else if (i < k) lo = i + 1;
            else return a[i];
        }
        return a[lo];
	}
	
	 private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
	 }
        

	 private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
	 }
	 
	 private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
    

	public static void main(String[] args) {
		String[] a = {"B", "A", "Z", "C"};
		Quick.sort2Distinct(a);
        show(a);
        assert isSorted(a);

        // shuffle
        StdRandom.shuffle(a);

        // display results again using select
//        StdOut.println();
//        for (int i = 0; i < a.length; i++) {
//            String ith = (String) Quick.select(a, i);
//            StdOut.println(ith);
//        }

	}

}

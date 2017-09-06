## 1.1.1
a. 7
b. 200.0000002
c. true

## 1.1.2
a. double, 1.618
a. double, 10.0
a. boolean, true
a. String, 33

## 1.1.3
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		int[] values = new int[3];
        int cnt = 0;
        while (cnt < 3){
           values[cnt] = StdIn.readInt();
           cnt++; 
        }
		if (values[0] == values[1] && values[1] == values[2] && values[0] == values[2]) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}

## 1.1.4

## 1.1.5
public static boolean equal(double x, double y) {
	return (0.0 < x && x < 1.0)  && (0.0 < y && y < 1.0);
}

## 1.1.6
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610

## 1.1.7
a. 3.00009
a. 499500
a. 1023

## 1.1.8
a. 'b'
a. 197
a.  e

## 1.1.9

## 1.1.10
int[] a not initialized with New

### 1.1.11
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
          
### 1.1.12
Prints 0-9

### 1.1.13
int[][] a = new int[3][3]
for (int i = 0; i < 3; i++)
	for (int i = 0; i < 3; i++)
			a[i][j] = a[i][j]
			
### 1.1.14
public static int lg(int N) {
    int value = 0;
    for (int i = N; i > 1; i/=2) {
    		value++;
    }
    return value;
}

### 1.1.15
public static int[] histogram(int a[], int M) {
	int returnArray[] = new int[M];
	for (int i = 0; i < a.length; i++) {
		returnArray[a[i]]++;
	}
	return returnArray;
}

### 1.1.16
311361142246
### 1.1.18
50, 33

### 1.1.19


	
	




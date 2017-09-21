import edu.princeton.cs.algs4.Stack;

public class Parentheses {
	
	public static boolean isBalanced(String s){
		Stack<Character> open = new Stack<Character>();
		int length = s.length();
		for(int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				open.push(c);
			}
			else if((c == ')' && (open.isEmpty() || open.pop() != '(')) ||
                    (c == ']' && (open.isEmpty() || open.pop() != '[')) ||
                    (c == '}' && (open.isEmpty() || open.pop() != '{'))) {
				return false;
			}
		}
		return open.isEmpty();
	}

	public static void main(String[] args) {
		StdOut.println(isBalanced("({)}"));

	}

}

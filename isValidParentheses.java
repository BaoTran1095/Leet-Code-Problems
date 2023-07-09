
import java.util.Stack;
public class isValidParentheses {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));

	}
	
	public static boolean isValid(String s) {
		if(s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
			return false;
		}
		Stack<char> stack = new Stack<char>();
		
        for(char c : s.toCharArray()) {
        	if(c == '(' || c == '{' || c == '[') {
    			stack.push(c);
    		}else {
    			stack.pop(c);
    		}
        }
		return true;
    }
}

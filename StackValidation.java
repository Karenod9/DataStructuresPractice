
import java.util.Stack;

public class StackValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String combo = "({})}";
		System.out.println(isComboValid(combo));

	}

	public static boolean isComboValid(String combo) {
		Stack<Character> stack = new Stack<Character>();

		boolean isValid = true;

		if(combo == null || combo.length() == 0){
			isValid = false;
		}
		else {
			for(int i=0; i<combo.length(); i++) {

					if(combo.charAt(i) == '{' || combo.charAt(i) == '[' || combo.charAt(i) == '(') {
						stack.push(combo.charAt(i));
					}else if (combo.charAt(i) == '}' || combo.charAt(i) == ']' || combo.charAt(i) == ')') {
						if(stack.isEmpty()) {

							isValid = false;

						}else {
							char topStack = stack.peek();
							if((combo.charAt(i) == '}' && topStack == '{')|| (combo.charAt(i) == ']' && topStack == '[') || (combo.charAt(i) == ')' && topStack == '(')) {
								stack.pop();
							}else {
								isValid = false;
							}
						}
					}
				}
			}

		return isValid;
	}
}

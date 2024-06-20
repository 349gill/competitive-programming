import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int temp;
		Stack<Integer> stack = new Stack<>();
		for (String i: tokens) {
			if(i.equals("+")) {
				stack.add(stack.pop() + stack.pop());
			}
			else if (i.equals("/")) {
				temp = stack.pop();
				stack.add(stack.pop() / temp);
			}
			else if (i.equals("*")) {
				stack.add(stack.pop() * stack.pop());
			}
			else if (i.equals("-")) {
				temp = stack.pop();
				stack.add(stack.pop() - temp);
			}
			else {
				stack.add(Integer.parseInt(i));
			}
		}	
		return stack.pop();
	}
}
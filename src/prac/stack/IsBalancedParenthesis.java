package prac.stack;

import java.util.Stack;

public class IsBalancedParenthesis {
    public static void main(String[] args) {
        String str = "{()}[]";
        if (isBalanced(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == '[' || currChar == '{' || currChar == '(') {
                stack.push(currChar);
            } else {
                if (stack.isEmpty())
                    return false;
                else if (!matching(stack.peek(), currChar))
                    return false;
                else
                    stack.pop();
            }
        }

        return (stack.empty());
    }

    private static boolean matching(Character peek, char currChar) {
        return ((peek == '(' && currChar == ')') ||
                (peek == '[' && currChar == ']') ||
                (peek == '{' && currChar == '}'));
    }
}

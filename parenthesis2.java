import java.util.Stack;

public class parenthesis2 {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' ) {
                stack.push(ch);
            } else if (ch == ')' ) {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
            }
        }

        return stack.isEmpty(); // must be empty if balanced
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')');
    }

    public static void main(String[] args) {
        String expr1 = "((()()))";
        String expr2 = "(()()()())";
        System.out.println(expr1 + " → " + isBalanced(expr1));
        System.out.println(expr2 + " → " + isBalanced(expr2));
    }
}

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String[] inputs = {"{[()]}", "{[(])}", "{{[[(())]]}}"};

        for (String input : inputs) {
            System.out.println(isBalanced(input));
        }
    }

    public static String isBalanced (String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return "NO";
                    }
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}

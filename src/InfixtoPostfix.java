import java.util.Stack;

public class InfixtoPostfix {
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";

        String postfix = InfixtoPostfix(infix);


        System.out.println("Input: " + infix + "\n" + "Output: " + postfix);
    }

    public static int precedence(char charc){
        switch (charc){
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    }
    public static String InfixtoPostfix (String inf) {
        StringBuilder expression = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i =0; i < inf.length(); i++){
            char c = inf.charAt(i);

        if(Character.isLetterOrDigit(c)) {
            expression.append(c);
        } else if (c == '(') {
                stack.push(c);
        } else if(c == ')') {
            while(!stack.isEmpty() && stack.peek() != '(')
               expression.append(stack.pop());
                stack.pop();
            }
        else{
            while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                if(stack.peek() == '('){
                    return "Invalid";
                }
                expression.append(stack.pop());
            }
            stack.push(c);
           }
        }

        while (!stack.isEmpty()){
            if(stack.peek() == '(') {
                return "Invalid";
            }
                expression.append(stack.pop());
            }
        return expression.toString();
    }
}

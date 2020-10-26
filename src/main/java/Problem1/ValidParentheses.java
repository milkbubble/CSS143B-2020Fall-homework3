package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        LinkedListStack strStack = new LinkedListStack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[')
            {
                strStack.push(c);
                continue;
            }

            if (c== '}' || c == ')' || c == ']') {
                if (strStack.size() == 0) {
                    return true;
                }
                char last = (char) strStack.peek();
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
                    strStack.pop();
                else
                    return false;
            }

        }

        return false;
    }
}

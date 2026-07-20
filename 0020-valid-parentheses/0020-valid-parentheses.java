class Solution {
    public boolean isValid(String s) {
        

        //  0 1
        // "( ("
        //      i

        //stack: 
        //
        //()[]{}

        Stack<Character> parenthesesStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char openChar = s.charAt(i);

            if (openChar == '(' || openChar == '[' || openChar == '{') {
                parenthesesStack.push(openChar);

            } else if (!parenthesesStack.isEmpty() && openChar == ')' && parenthesesStack.peek() == '(') {
                parenthesesStack.pop();

            } else if (!parenthesesStack.isEmpty() && openChar == '}' && parenthesesStack.peek() == '{') {
                parenthesesStack.pop();

            } else if (!parenthesesStack.isEmpty() && openChar == ']' && parenthesesStack.peek() == '[') {
                parenthesesStack.pop();
            } else {
                return false;
            }
        }

        return parenthesesStack.isEmpty();

    }

}
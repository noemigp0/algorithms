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
            

            char curentChar = s.charAt(i);

            if (curentChar == '(' || curentChar == '[' || curentChar == '{') {
                parenthesesStack.push(curentChar);

            }
            if(parenthesesStack.isEmpty()){return false;}
             if (curentChar == ')' && parenthesesStack.pop() != '(') {
                return false;
             }

            if (curentChar == '}' && parenthesesStack.pop() != '{') {
                return false;}

             if (curentChar == ']' && parenthesesStack.pop() != '[') {
                return false;
            } 
        }

        return parenthesesStack.isEmpty();

    }

}
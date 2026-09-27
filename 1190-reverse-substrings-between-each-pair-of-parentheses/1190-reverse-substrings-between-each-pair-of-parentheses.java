class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
         StringBuilder current = new StringBuilder();
       for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // Save what we have before '('
                stack.push(current.toString());
                current = new StringBuilder();
            }

            else if (ch == ')') {
                // Reverse content inside brackets
                current.reverse();

                // Get the string before '('
                current.insert(0, stack.pop());
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
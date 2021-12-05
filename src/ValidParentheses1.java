import java.util.Stack;

public class ValidParentheses1 {

    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("([)]"));
        System.out.println(isValid("{([()()])}"));
//        System.out.println(isValid("(){}}{"));
//        System.out.println(isValid("(}{)"));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); // We will put following characters in stack.

        for(int i = 0; i < s.length(); i++){ // Run a loop to insert, check and remove
            char ch = s.charAt(i); // Get the charcters from the string

            if(ch == '(' || ch == '{' || ch == '['){ // If the brackets are opening in the starting, we will only insert them to the stack
                st.push(ch);
            }
            // Now we will check for every type of closing bracket's,
            else if(ch == ')'){  // like in this one we are dealing with closing circulary bracket
                if(st.size() == 0){ // If the stack size is zero and closing bracket's left, return false;
                    return false;
                }
                else if(st.peek() != '('){ // If the opening bracket is not similar to that which we are looking for return false;
                    return false;
                }
                else{ // If the closing bracket is similar to the opening bracket remove it from stack.
                    st.pop();
                }
            }
            else if(ch == '}'){  // in this one we are dealing with closing curly bracket
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch == ']'){  // And in this one we are dealing with closing square bracket,
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '['){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        // Coming out of the loop;
        if(st.size() == 0){ // Check if stack size if 0 all remove it means it's Valid Parentheses;
            return true; // return true;
        }
        else{ // Otherwise
            return false;
        }
    }
}

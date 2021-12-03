public class ValidParentheses1 {

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
        System.out.println(isValid("{}("));
        System.out.println(isValid("{}()[][][]{}{}"));
    }

    public static boolean isValid(String s) {
        if(s.length()  % 2 != 0) {
            return false;
        }

        char parentheses_open            = 40; //        '(' 40
        char parentheses_close           = 41; //        ')' 41
        char square_brackets_open        = 91; //        '[' 91
        char square_brackets_close      = 93; //        ']' 93
        char curl_brackets_open          = 123;//        '{' 123
        char curl_brackets_close         = 125;//        '}' 125

        if(s.length() == 2) {
            if(s.charAt(0) == square_brackets_open
                    && s.charAt(1) == square_brackets_close) {
                return true;
            } else if(s.charAt(0) == curl_brackets_open
                    && s.charAt(1) == curl_brackets_close) {
                return true;
            } else if(s.charAt(0) == parentheses_open
                    && s.charAt(1) == parentheses_close) {
                return true;
            }

            return false;
        }

        boolean ret = true;

        for (int i = 0; i < s.length(); i=i+2) {
            if((s.charAt(i) == square_brackets_open
                    && s.charAt(i+1) != square_brackets_close) ||
                    (s.charAt(i) == curl_brackets_open
                            && s.charAt(i+1) != curl_brackets_close) ||
                    (s.charAt(i) == parentheses_open
                            && s.charAt(i+1) != parentheses_close)) {

                ret = false;
                break;
            }
        }

        if(!ret) {

        }

        return ret;
    }
}

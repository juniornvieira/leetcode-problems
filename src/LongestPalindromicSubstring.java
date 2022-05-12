public class LongestPalindromicSubstring {

    public static void main(String[] args) {

//        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
//        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("ccc"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cc"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("c"));
    }

    public String longestPalindrome(String s) {

        String result = "";
        int resultLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;

            //odd
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > resultLength) {
                    result = s.substring(l,r+1);
                    resultLength = result.length();
                }

                l--;
                r++;
            }

            //even
            l = i;
            r = i+1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > resultLength) {
                    result = s.substring(l,r+1);
                    resultLength = result.length();
                }

                l--;
                r++;
            }
        }

        return result;
    }
}

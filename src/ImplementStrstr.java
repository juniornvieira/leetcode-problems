public class ImplementStrstr {

    public static void main(String[] args) {
//        String haystack = "hello";
//        String needle = "ll";
//        String haystack = "aaaaa";
//        String needle = "bba";
//        String haystack = "";
//        String needle = "";
//        String haystack = "";
//        String needle = "a";
//        String haystack = "a";
//        String needle = "a";
        String haystack = "aaa";
        String needle = "a";

        System.out.println(new ImplementStrstr().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle)  {
        if(needle.length() == 0) {
            return 0;
        }

        String[] needleArray = haystack.split(needle);
        if(needleArray.length == 0) {
            return 0;
        }

        int length = needleArray[0].length();
        if(length == haystack.length()) {
            return -1;
        }

        return length;
    }
}

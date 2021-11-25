import java.util.Arrays;

public class LongestCommonPrefix1 {

    public static void main(String[] args) {
//        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs = new String[]{"dog","racecar","car"};
//        String[] strs = new String[]{""};
//        String[] strs = new String[]{"a"};
//        String[] strs = new String[]{"ab", "a"};
//        String[] strs = new String[]{"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1 ].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);
            }
            else
                return result.toString();
        }
        return result.toString();
    }
}

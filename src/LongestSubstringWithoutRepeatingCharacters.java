import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(" "));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("au"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("auq"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 1) {
            return s.length();
        }

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int result = 0;
        for (int start = 0; start < s.length(); start++) {
            char c = s.charAt(start);

            if (!charIndexMap.containsKey(c)) {
                charIndexMap.put(c, start);
            }

            for (int end = start + 1; end < s.length(); end++) {
                c = s.charAt(end);

                if (!charIndexMap.containsKey(c)) {
                    charIndexMap.put(c, end);
                } else {
                    break;
                }
            }

            if (charIndexMap.size() > result) {
                result = charIndexMap.size();
            }
            charIndexMap.clear();
        }
        return result;
    }
}

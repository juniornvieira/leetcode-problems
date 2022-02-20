public class LengthOfLastWord {

    public static void main(String[] args) {
//        String s = "Hello World";
//        String s = "   fly me   to   the moon  ";
        String s = "luffy is still joyboy";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }


    public int lengthOfLastWord(String s) {
        String[] sArray = s.split(" ");
        return sArray[sArray.length-1].length();
    }
}

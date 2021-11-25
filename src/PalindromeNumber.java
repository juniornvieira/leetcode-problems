public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int x) {
        if(x<0 ||(x%10==0 && x!=0))
            return false;
        int rev = 0, temp=x;
        while(temp>0) {
            int rem = temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev==x;
    }
}

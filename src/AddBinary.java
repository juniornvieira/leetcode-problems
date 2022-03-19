import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
//        String a = "11", b = "1";
//        String a = "1010", b = "1011";
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";


        System.out.println(new AddBinary().addBinary(a,b));
    }

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int intA = a.length() - 1;
        int intB = b.length() - 1;
        int carry = 0;
        while(intA>=0 || intB>=0){
            int sum = carry;
            if(intA>=0){
                sum += a.charAt(intA--)-'0';
            }
            if(intB>=0){
                sum += b.charAt(intB--)-'0';
            }
            sb.insert(0,sum%2);
            carry = sum/2;
        }
        if(carry!=0){
            sb.insert(0,carry);
        }
        return sb.toString();
    }
}

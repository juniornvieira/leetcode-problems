import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {

    public static void main(String[] args) {
//        int [] digits = {1,2,3};
//        int [] digits = {4,3,2,1};
//        int [] digits = {9};
//        int [] digits = {1,9};
//        int [] digits = {9,9};
//        int [] digits = {8,9,9,9};
//        int [] digits = {9,8,9};
        int [] digits = {9,8,9,9};
        System.out.println(new PlusOne().plusOne(digits));
    }

    public int[] plusOne(int[] digits) {

        if (digits[digits.length-1] == 9) {

            if(digits.length == 1) {
                return new int[] {1,0};
            }

            if(digits.length >= 2 && digits[digits.length-2] == 9) {

                boolean contains = IntStream.of(digits).anyMatch(x -> x != 9);
                if (!contains) {
                    int [] output = new int[digits.length+1];
                    output[0] = 1;
                    return  output;
                } else {

                    int [] output = digits.clone();

                    for (int i = digits.length-1; i >= 0; i--) {
                        if(digits[i] == 9) {
                            output[i] = 0;
                        } else {
                            output[i] = output[i] + 1;
                            return output;
                        }
                    }
                    return output;

                }
            } else {

                int [] output = digits.clone();
                output[digits.length - 2 ] = output[digits.length - 2 ] + 1;
                output[digits.length - 1 ] = 0;

                return output;
            }
        } else {
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }
    }
}

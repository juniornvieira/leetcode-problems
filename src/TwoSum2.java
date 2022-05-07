import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum2 {

    public static void main(String[] args) {
        System.out.println(new TwoSum2().twoSum(new int[]{7,2,13,11,8}, 24));
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> idxMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int requiredValue =  target - nums[i];
            if(idxMap.containsKey(requiredValue)){
                int[] returnIdx = {idxMap.get(requiredValue),i};
                return returnIdx;
            } else {
               idxMap.put(nums[i], i);
            }

        }
        return null;

    }
}

public class MaximumSubarray {

    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int [] nums = {1};
//        int [] nums = {5,4,-1,7,8};

        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur < 0) {
                cur = nums[i];
            } else {
                cur += nums[i];
            }
            if (cur > total) {
                total = cur;
            }
        }
        return total;
    }
}

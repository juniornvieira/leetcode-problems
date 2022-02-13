import java.util.stream.IntStream;

public class SearchInsertPosition {
    public static void main(String[] args) {

//        int [] nums = new int[]{1,3,5,6};
//        int target = 6;
//        int [] nums = new int[]{1,3,5,6};
//        int target = 2;
//        int [] nums = new int[]{1,3,5,6};
//        int target = 7;
        int [] nums = new int[]{1,3,5,6};
        int target = 0;

        System.out.println(new SearchInsertPosition()
                .searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {

        int i1 = IntStream.range(0, nums.length)
                .filter(i -> target == nums[i])
                .findFirst()
                .orElse(-1);

        if (i1 != -1) {
            return i1;
        }

        //target fewer than indexes contains
        if(target < nums[0]) {
            return 0;
        }

        //return the index find between indexes
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
        }

        //target higher than indexes contains
        return nums.length;
    }
}

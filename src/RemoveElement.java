public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(new RemoveElement().removeDuplicates(nums,3));
    }
    public int removeDuplicates(int[] nums, int val) {

        if (nums.length == 1) {
            if(nums[1] == val)
                return 0;
            else
                return 1;
        }

        int index=0;
        for(int i=0;i<nums.length-1;i++) {
            if(val != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] arr) {
        int index=1;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != arr[i+1]) {
                arr[index++] = arr[i+1];
            }
        }
        return index;
    }

}

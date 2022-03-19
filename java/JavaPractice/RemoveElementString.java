import java.util.Arrays;

public class RemoveElementString {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("remove element after target: "+ Arrays.toString(nums));
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 3, 9, 7};
        int[] nums1 = {1, 4, 3, 2};
        int abc = RemoveElementString.removeElement(nums1, 2);
        System.out.println("Final value after remove " + abc);
    }

}

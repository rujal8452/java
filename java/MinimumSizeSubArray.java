import java.util.Arrays;
import java.util.Vector;

public class MinimumSizeSubArray {
    public static int minSubArrayLen1(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int value = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            value = nums[i];
            if (value == target) {
                return 1;
            } else {

                for (int j = 0; j < i; j++) {
                    value = nums[i] + nums[j];
                    if (value == target) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 8, 4, 3};
        int[] nums2 = {8};


        int abc = MinimumSizeSubArray.minSubArrayLen(7, nums2);
        System.out.println("Final value after pairSum : " + abc);
    }

}

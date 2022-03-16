import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxValue = 0;

        for (int i = 0; i <= nums.length - 1; i = i + 2) {
            if (i + 1 < nums.length) {
                maxValue += nums[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 3, 2};


        int abc = ArrayPairSum.arrayPairSum(nums1);
        System.out.println("Final value after pairSum : " + abc);
    }
}

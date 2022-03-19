public class PivotFromArray {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;

        int n = nums.length;
        int totalsum = 0, leftsum = 0;

        for (int i : nums)
            totalsum += i;

        for (int i = 0; i < n; i++) {
            if (leftsum == (totalsum - nums[i]))
                return i;
            else {
                leftsum += nums[i];
                totalsum -= nums[i];

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {105, 1100, 0, 12345, 111, 10};
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        PivotFromArray pivotFromArray = new PivotFromArray();
        int abc = pivotFromArray.pivotIndex(nums);
        System.out.println("final value " + abc);
    }

}

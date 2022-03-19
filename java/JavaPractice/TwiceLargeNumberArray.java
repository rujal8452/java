public class TwiceLargeNumberArray {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int largestNumber = 0;
        int largestNumberIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNumber) {
                largestNumber = nums[i];
                largestNumberIndex = i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != largestNumberIndex) {
                if (nums[j] == largestNumber || nums[j] * 2 > largestNumber) {
                    return -1;
                }
            }
        }
        return largestNumberIndex;
    }


    public int dominantIndex1(int[] nums) {
        int theLargest = 0;
        int largestIndex = 0;
        int compare = 0;

        for(int i = 0; i < nums.length; i++){
            if(theLargest<nums[i]){
                theLargest = nums[i];
                largestIndex = i;
            }
        }

        for (int num : nums) {
            compare = 2 * num;
            if (compare > theLargest && num != theLargest) {
                return -1;
            }
        }
        return largestIndex;
    }

    public static void main(String[] args) {
        int[] nums = {105, 1100, 0, 12345, 111, 10};
        int[] nums1 = {3, 6, 1, 0};
        TwiceLargeNumberArray twiceLargeNumberArray = new TwiceLargeNumberArray();
        int abc = twiceLargeNumberArray.dominantIndex1(nums);
        System.out.println("final value " + abc);
    }

}

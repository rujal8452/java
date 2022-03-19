import java.util.Arrays;

public class ReplaceElementTwoPointer {

    public static int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int response = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == val) {
                response++;
                if (nums[right] == val) {
                    nums[right] = nums[left];
                    right--;
                } else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
            } else {
                left++;
            }
        }
        System.out.println("Final value after remove " + Arrays.toString(nums));

        return response;
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[left++] = nums[i];
            }
        }
        System.out.println("Final value after remove " + Arrays.toString(nums));
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int abc = ReplaceElementTwoPointer.removeElement(nums, 2);
        System.out.println("Final value after remove " + abc);
    }
    //System.out.println("Final value after remove " + Arrays.toString(nums));
//        for (int left1 = 0; left1 < nums.length - 1; left1++) {
//            if (nums[left1] == val) {
//                response++;
//                for (int right1 = nums.length - 1; right1 > left1; right1--) {
//                    if (nums[right1] != val) {
//                        nums[left1] = nums[right1];
//                        nums[right1] = 000;
//                        break;
//                    } else {
//                        response++;
//                        nums[right1] = 000;
//                    }
//                }
//            }
//    }


}

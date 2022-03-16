class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int newlength = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[j - 1]) {
                        newlength++;
                    } else {
                        break;
                    }
                }
                if (newlength > length) {
                    length = newlength;
                }
            }
        }
        return length;
    }

    public int findMaxConsecutiveOnes1(int[] nums) {
        int res = 0;
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                count++;
            } else if (nums[i] == 0) {
                res = Math.max(res, count);
                count = 0;
            }
            i++;
        }
        return Math.max(res, count);
    }

    public static void main(String[] args) {
        findMaxConsecutiveOnes findMaxConsecutiveOnes = new findMaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 0, 1, 1, 1};
        int abc = findMaxConsecutiveOnes.findMaxConsecutiveOnes1(nums);
        System.out.println("final value" + abc);
    }
}
import java.util.Arrays;

public class ArrayPartitionSumByTarget {
    public static int[] twoSum(int[] numbers, int target) {

        if (numbers == null || numbers.length == 0) {
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] > target) {
                    break;
                }
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum1(int[] num, int target) {
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 3, 9, 7};
        int[] nums1 = {1, 4, 3, 2};


        int[] abc = ArrayPartitionSumByTarget.twoSum1(nums1, 2);
        System.out.println("Final value after pairSum : " + Arrays.toString(abc));
    }

}



public class findNumbersOfEvenDigit {
    public int findNumbers(int[] nums) {
        int number = 0;
        int output = 0;
        for (int num : nums) {
            if (num / 10 == 0) {
                output++;
            } else {
                int remainder = num / 10;
                if (remainder != 0 ) {
                    System.out.println(remainder);
                }
            }

        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {105, 1100, 0, 123456, 111, 10};
        findNumbersOfEvenDigit findNumbersOfEvenDigit = new findNumbersOfEvenDigit();
        int abc = findNumbersOfEvenDigit.findNumbers(nums);
        System.out.println("final value " + abc);
    }
}

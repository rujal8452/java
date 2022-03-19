import java.util.Arrays;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
        System.out.println("Final output :" + Arrays.toString(s));
        return s;
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] abc = ReverseString.reverseString(s);
        System.out.println("final value: " + Arrays.toString(abc));
    }

}

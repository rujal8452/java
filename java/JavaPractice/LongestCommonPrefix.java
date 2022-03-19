import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int i = 1;

        while (i < strs.length) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            i++;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight", "abc"};

        String abc = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println("final value: " + abc);

//        String str = "apple";
//        String prefix = "app";
//        boolean result = str.startsWith(prefix);
//        System.out.println("Does str start with specified suffix? " + result);
    }
}

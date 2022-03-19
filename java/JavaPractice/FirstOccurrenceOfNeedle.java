public class FirstOccurrenceOfNeedle {

    private static int strStr(String haystack, String needle) {

        if (haystack.isEmpty() || needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 1; j <= needle.length() - 1; j++) {
                    if (j + i <= haystack.length() - 1) {
                        if (haystack.charAt(i + j) == needle.charAt(j)) {
                            if (j == needle.length() - 1) {
                                return i;
                            }

                        } else {
                            break;
                        }
                    }
                }
                if (needle.length() == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public static int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        int abc = FirstOccurrenceOfNeedle.strStr2("a", "b");
        System.out.println("Final output " + abc);
    }
}

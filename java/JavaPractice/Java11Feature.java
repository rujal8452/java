import java.util.LinkedList;

public class Java11Feature {

    public static void main(String[] args) {

        Java11Feature java11Feature = new Java11Feature("  abc   \n");
    }

    public Java11Feature(String abc) {
        System.out.print("repeat = " + abc.repeat(3));
        System.out.print("repeat = " + abc.strip());

        String multilineStr = "This is\n \n a multiline\n string.";

        long lineCount = multilineStr.lines()
                .filter(String::isBlank)
                .count();
        System.out.print("line count = " + lineCount);
        
    }

}

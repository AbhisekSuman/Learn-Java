package StringManipulation;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String  s = "avcavc";
        System.out.println(s.matches("(avc)+"));

        Pattern.compile("cdn");
    }
}

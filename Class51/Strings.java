package Class51;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Omkar";
        String str2 = "Omkar";

        if (str1 == str2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

        if (str1.equals(str2))
            System.out.println("Values are equal");
        else
            System.out.println("Values are not equal");

        String s1 = new String("Omkar");
        String s2 = new String("Omkar");

        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

        if (s1.equals(s2    ))
            System.out.println("Values are equal");
        else
            System.out.println("Values are not equal");
    }
}

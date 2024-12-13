package Class52;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Kodnest";
        String s2 = "KodNest";

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal by ignoring the cases");
        }
        else {
            System.out.println("Strings are not equal");
        }
        System.out.println("-----------------------------------------------------------");
        String s3 = "Rama";
        String s4 = "Sita";

        String str1 = s3 + s4;
        String str2 = s3 + s4;

        if (str1 == str2)
            System.out.println("References are equal");
        else
            System.out.println("References are not equal");

        if (str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        System.out.println("----------------------------------------------------------");
        String str3 = "Rama" + "Sita";
        String str4 = "Rama" + "Sita";

        if (str3 == str4)
            System.out.println("References are equal");
        else
            System.out.println("References are not equal");

        if (str3.equals(str4))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}

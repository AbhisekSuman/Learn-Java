package Class52;

public class BuildInMethods {
    public static void main(String[] args) {
        String s = "Raja Ram Mohan Roy";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("R"));
        System.out.println(s.contains("Mohan"));
        System.out.println(s.startsWith("Ram"));
        System.out.println(s.endsWith("Roy"));
        System.out.println(s.length());
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("Mohan"));
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
        System.out.println(s.replace('a', 's'));
        System.out.println(s.substring(9));
        System.out.println(s.substring(9, 14));
    }
}

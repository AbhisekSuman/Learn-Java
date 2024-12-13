package Class52;

public class Immutable {
    public static void main(String[] args) {
        String s = "KodNest";
        System.out.println(s);
        s.concat("Tech");
        System.out.println(s);
        s = s.concat("Tech");
        System.out.println(s);
    }
}

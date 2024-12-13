package Class51;

public class Demo {
//    Command Line Arguments
    public static void main(String[] args) {
        System.out.println("Arguments are: ");
        for (String s : args) {
            System.out.println(s);
        }
        main();
    }

    public static void main() {
        System.out.println("method with 0 parameter");
        int[] a = {10,20,30};
        main(a);
    }

    public static void main(int[] a) {
        System.out.println("Method with integer parameter");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        main(10,"Omkar");
    }

    public static void main(int a, String s) {
        System.out.println("Method with 2 parameter");
        System.out.println(a + " " + s);
    }
}

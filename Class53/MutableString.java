package Class53;

public class MutableString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rama");
        System.out.println(stringBuffer);
        stringBuffer.append("Sita");
        System.out.println(stringBuffer);

        System.out.println("********************************");

        StringBuilder stringBuilder = new StringBuilder("Kodnest");
        System.out.println(stringBuilder);
        stringBuilder.append("Tech");
        System.out.println(stringBuilder);

        System.out.println("==========================");
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Omakar is a batsman");
        System.out.println(sb.capacity());
        sb.append("He lives in Bengaluru");

        System.out.println("********************************");
        StringBuilder sb1 = new StringBuilder();
//        The default capacity is 16
//        If it extends 16 the the new capacity = oldCapacity * 2 + 2
        System.out.println(sb1.capacity());
        sb1.append("Sachin is a batsman");
        System.out.println(sb1.capacity());
        sb1.append("He lives in Mumbai");
        System.out.println(sb1.capacity());

        System.out.println("===========================");
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());
//        By this method we are also set a capacity of a string
        StringBuilder sb3 = new StringBuilder(200);
        System.out.println(sb3.capacity());
    }
}

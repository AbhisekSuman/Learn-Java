package Class53;

public class MethodsInMutableString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.isEmpty());
        stringBuffer.append("Hello, How are you");
        System.out.println(stringBuffer.isEmpty());
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(4));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer);
        System.out.println("===========     Convert immutable to mutable    ======================");
        String s = "Raja Ram Mohan Roy";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);      
    }
}

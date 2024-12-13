//      Conversion of given Decimal number to a Binary number

public class Class24 {
    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.conversion(20));
    }
}

 class BinaryNumber {
    String conversion(int number) {
        String binary = "";
        while (number > 0) {
            binary = (number % 2) + binary;
            number = number/2;
        }
        return binary;
    }

}
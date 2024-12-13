public class Class23 {
//    Print a number is Armstrong number or Not
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        boolean res = armstrong.checkArmstrong(153);

        if (res) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not");
        }
    }
}

//Class to check the Armstrong number
class Armstrong {
    boolean checkArmstrong (int n) {
        int sum = 0;
        int power = getDigit(n);
        int num  = n;
        while (n > 0) {
            int digit = n % 10;
            sum += getPower(digit, power);
            n = n / 10;
        }
        return sum == num;
    }
//
    int getDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    int getPower(int digit, int power) {
        int result = 1;
        while (power > 0) {
            result *= digit;
            power--;
        }
        return result;
    }
}

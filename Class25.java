import java.util.Scanner;

public class Class25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      *********          Fibonacci Series     **************************************
//        System.out.println("Enter a range to print Fibonacci Series: ");
//        int range = scanner.nextInt();
//        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.printFibonacci(range);

//     *****************    Palindrome Number       */******************************
//        System.out.println("Enter a number to check a number is palindrome or not");
//        int num = scanner.nextInt();
//        Palindrome palindrome = new Palindrome();
//        palindrome.palindrome(num);

//        *************     Single Digit SUm
//        System.out.println("Enter a number to calculate Single digit sum: ");
//        int number = scanner.nextInt();
//        System.out.print("Single digit Sum is: ");
//        SingleDigitSum obj = new SingleDigitSum();
//        System.out.println(obj.singleDigitSum(number));

//        ******************        GCD     *********************************
//        System.out.println("Enter two number to find the GCD of a number: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        GCD gcd = new GCD();
//        System.out.println("The GCD of " + a +" and " + b + " is " + gcd.findGCD(a, b));

//
//        System.out.println("Enter a number to find the smallest digit: ");
//        int n = scanner.nextInt();
//        SmallestDigit smallestDigit = new SmallestDigit();
//        System.out.println("The smallest digit of " + n + " is " + smallestDigit.findSmallestDigit(n));

//        System.out.println("Enter a number to print factors: ");
//        int num = scanner.nextInt();
//        Factors factors = new Factors();
//        factors.printFactors(num);

//  **************      Prime Number        ***********************

        Prime prime = new Prime();
        System.out.println("Enter a number to check a Prime number or not: ");
        int num = scanner.nextInt();
        if (num == 1)
            System.out.println(num + " is a special number");
        else if (prime.isPrime(num))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

        System.out.println("Enter a number to print Prime numbers: ");
        int range = scanner.nextInt();
        prime.printPrimeInRange(range);
    }
}

//Fibonacci Series up to a given range
class Fibonacci {
    public void printFibonacci(int range) {
        System.out.println("The demanded fibonacci series is: ");
        int fib1 = 0;
        int fib2 = 1;

        if (range == 1) {
            System.out.print(fib1);
        } else if (range == 2) {
            System.out.print(fib1 + " " + fib2);
        } else {
            System.out.print(fib1 + " " + fib2);
            for (int i = 2; i < range; i++) {
                int next = fib1 + fib2;
                System.out.print(" " + next);
                fib1 = fib2;
                fib2 = next;
            }
        }
        System.out.println();
    }
}

//Check the given number is palindrome number or not
class Palindrome {
    public void palindrome(int num) {
        if (checkPalindrome(num))
            System.out.println(num + " is a Palindrome number");
        else
            System.out.println(num + " is not a Palindrome number");
    }

    public boolean checkPalindrome(int number) {
        return number == reversedNumber(number);
    }

    public int reversedNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}

//Calculate the Single digit Sum of a number
class SingleDigitSum {
    public int singleDigitSum(int n) {
        while (n >= 10) {
            n = sumOfDigit(n);
        }
        return n;
    }

    public int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

//Calculate the GCD of a Number
class GCD {
    public int findGCD(int a, int b) {
        int rem = a % b;
        if (rem == 0) {
            return b;
        } else {
            while (rem != 0) {
                a = b;
                b = rem;
                rem = a % b;
            }
            return b;
        }
    }
}

//Find smallest Digit
class SmallestDigit {
    public int findSmallestDigit(int num) {
        int smallest = num % 10;
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest)
                smallest = digit;
            num /= 10;
        }
        return smallest;
    }
}

//class PerfectSquare {
//    public void checkPerfectSquare(int num) {
//
//    }
//
//    public int calculateSquareRoot(int num) {
//        Math.sqrt(num);
//    }
//}

//Find the factors of a given number
class Factors {
    public void printFactors(int num) {
        System.out.println("Factors of " + num + " is: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

//Print prime numbers and also check a number is prime or not
class Prime {
    public boolean isPrime(int num) {
//        int factors = 0;
        if (num == 2)
            return true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
//                factors++;
//            if (factors > 2) {
//                return false;
//            }
        }
        return true;
    }

    public void printPrimeInRange(int num) {
        System.out.println("The prime numbers are: ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}

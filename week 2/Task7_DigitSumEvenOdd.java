public class Task7_DigitSumEvenOdd {
    public static void main(String[] args) {

        int num = 123456;
        int evenSum = 0, oddSum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            num /= 10;
        }

        System.out.println("Even Digit Sum: " + evenSum);
        System.out.println("Odd Digit Sum: " + oddSum);
    }
}

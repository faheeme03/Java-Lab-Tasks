public class Task9_LastDigitSum {
    public static void main(String[] args) {

        int a = 123;
        int b = 456;

        int sum = (a % 10) + (b % 10);
        System.out.println("Sum of Last Digits: " + sum);
    }
}

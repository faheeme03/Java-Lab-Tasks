public class Task5_PalindromeNumber {
    public static void main(String[] args) {

        int num = 121, rev = 0, temp = num;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}

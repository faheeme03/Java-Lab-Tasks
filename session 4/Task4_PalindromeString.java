public class Task4_PalindromeString {
    public static void main(String[] args) {

        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}

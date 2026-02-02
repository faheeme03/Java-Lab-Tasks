public class Task10_CyclicDigitSum {
    public static void main(String[] args) {

        int num = 123;
        int sum = 0;

        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }

        System.out.println("Cyclic Digit Sum: " + sum);
    }
}

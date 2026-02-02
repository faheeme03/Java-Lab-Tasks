import java.util.*;

public class Task3_MiniMaxSum {
    public static void main(String[] args) {

        long[] arr = {1, 2, 3, 4, 5};
        long total = 0;

        for (long n : arr) total += n;

        long min = Arrays.stream(arr).min().getAsLong();
        long max = Arrays.stream(arr).max().getAsLong();

        System.out.println("Min Sum: " + (total - max));
        System.out.println("Max Sum: " + (total - min));
    }
}

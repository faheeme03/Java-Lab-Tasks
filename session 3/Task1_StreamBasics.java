import java.util.*;
import java.util.stream.*;

public class Task1_StreamBasics {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3, 7);

        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println("Sorted Numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class SmallElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 25, 5, 40, 15};

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if (k > 0 && k <= arr.length) {
            System.out.println("Kth smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid K value!");
        }
    }
}

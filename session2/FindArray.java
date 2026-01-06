import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
       
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the index:");
        int index = sc.nextInt();

        if ( index >= 0 && index < arr.length){
            System.out.println("element at index " + index + " is " + arr[index] );
        }
else {
    System.out.println(" invalid index");
}
sc.close();
    }     
}
import java.util.*;

public class RemovingElemFromArray {
    public static void main(String[] args) {
        int size = 6;
        int[] arr = new int[size];
        System.out.println("Enter 6 array elements: ");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        int x = 0; // helps in removing index 0 value
        for (int i = x; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size = arr.length - 1;
        System.out.println("\nArray elems are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
import java.util.Scanner;

public class findingDuplicatesInArray {

    public static int checkDuplicasy(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = checkDuplicasy(arr, n);
        if (res == 1) {
            System.out.println("Duplicates elements are present!");
        } else {
            System.out.println("Duplicates elements are not present!");
        }
    }
}
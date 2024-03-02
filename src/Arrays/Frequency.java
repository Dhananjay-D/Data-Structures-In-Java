import java.util.Scanner;

public class Frequency {

    public static void frequencyOfNum(int[] arr, int key, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Frequency of " + key + " is: " + count);
    }

    public static void main(String[] args) {
        int[] arr = { 11, 21, 14, 17, 19, 20, 19, 12, 19, 19 };
        Scanner sc = new Scanner(System.in);
        int key, count = 0;
        System.out.println("Enter the key element: ");
        key = sc.nextInt();
        frequencyOfNum(arr, key, count);
    }
}
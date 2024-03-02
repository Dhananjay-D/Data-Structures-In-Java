//linear search programm
package Arrays;
public class linearSearch{

    public static int linearSearching(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // returning the index of array where element is present
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 8;
        int ans = linearSearching(arr, key);
        System.out.print(ans);
    }

}


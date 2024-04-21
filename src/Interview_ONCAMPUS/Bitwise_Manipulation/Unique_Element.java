//package Interview_ONCAMPUS.Bitwise_Manipulation;
// Time complexity : O(N) , Space Complexity : O(1)
public class Unique_Element {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 4, 6, 2}; // Example array with duplicates
        int uniqueElement = findUniqueElement(array);
        System.out.println("The unique element is: " + uniqueElement);
    }
    public static int findUniqueElement(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
            // XORing all the array elements
            // the numbers which repeats will be cancelled off and unique will be remaining
        }
        return result;
    }
}

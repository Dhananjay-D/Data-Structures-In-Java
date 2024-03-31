
//  Given an integer n, return the number of prime numbers that are strictly less than n .
//  leetcode problem no: 204 . 

public class CountPrimeNums {

    public static boolean isPrime(int x) {
        if (x == 2) {
            return true;
        } else {
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        if (n == 1 || n == 0 || n == 2) {
            count = 0;
        } else {

            for (int i = 2; i < n; i++) {
                boolean res = isPrime(i);
                if (res == true) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
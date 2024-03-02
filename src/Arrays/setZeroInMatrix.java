package Arrays;

import java.util.ArrayList;

class setZeroInMatrix {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int x : rows) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == x) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        for (int y : columns) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j == y) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 0, 5 }, { 6, 7, 8 } };
        setZeroes(arr);
        System.out.println(arr);
    }
}
import java.util.*;

public class Spiral_matrix {
    public static void main(String[] args) {
        int n = 3;
        int i, j, top = 0, btm = n - 1, left = 0, right = n - 1;
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        while (top <= btm && left <= right) {
            for (i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");

            }
            top++;
            for (i = top; i <= btm; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            for (i = right; i >= left; i--) {
                System.out.print(arr[btm][i] + " ");

            }
            btm--;
            for (i = btm; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }

    }
}

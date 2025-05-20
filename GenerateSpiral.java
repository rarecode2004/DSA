import java.util.*;

public class GenerateSpiral {
    // Online Java Compiler

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int value = 1;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        // Fill the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        // Print the matrix
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}

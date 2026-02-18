import java.util.Arrays;
import java.util.Scanner;
public class product_of_n_matrices {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matrices:");
        int n = sc.nextInt();
        int[][][] matrices = new int[n][][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the dimensions of matrix " + (i + 1) + " (rows columns):");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            matrices[i] = new int[rows][cols];
            System.out.println("Enter the elements of matrix " + (i + 1) + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    matrices[i][r][c] = sc.nextInt();
                }
            }
        }

        int[][] result = multiplyMatrices(matrices);
        System.out.println("Product of the given matrices:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        
        sc.close();
    }

    public static int[][] multiplyMatrices(int[][][] matrices) {
        int[][] result = matrices[0];
        for (int i = 1; i < matrices.length; i++) {
            result = multiplyTwoMatrices(result, matrices[i]);
        }
        return result;
    }

    public static int[][] multiplyTwoMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Incompatible matrix dimensions for multiplication.");
        }

        int[][] product = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }
    
}

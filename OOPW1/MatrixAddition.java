import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = input.nextInt();

        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

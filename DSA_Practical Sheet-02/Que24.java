import java.util.Scanner;

public class Que24
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the matrices (rows x columns):");

        System.out.print("Rows for A and B: ");
        int rows = scanner.nextInt();

        System.out.print("Columns for A and B: ");
        int columns = scanner.nextInt();

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        System.out.println("Enter the elements of Matrix A:");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix B:");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = new int[rows][columns];

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Sum of Matrices (Metrics):");
        printMatrix(resultMatrix);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

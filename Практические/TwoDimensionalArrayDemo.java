package practice16;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int size = 5;
        int[][] identityMatrix = createIdentityMatrix(size);

        System.out.println("Квадратная матрица с единицами на главной диагонали:");
        printMatrix(identityMatrix);

        int rows = 6;
        int[][] pascalTriangle = createPascalTriangle(rows);
        System.out.println("Треугольник Паскаля:");
        printJaggedArray(pascalTriangle);
    }

    private static int[][] createIdentityMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }

        return matrix;
    }

    private static int[][] createPascalTriangle(int rows) {
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void printJaggedArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixAddition {
    public void matrixAdditionFunction() {
        try {
System.out.println("Matrix Addition Started");
            int[][] firstMatrix = {
                    { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
            };
            int[][] secondMatrix = {
                    { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 }
            };
            int rows = firstMatrix.length;
            int columns = firstMatrix[0].length;
            int[][] resultMatrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
            System.out.println("Result of Matrix Addition:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix Addition Completed");
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Matrix care Addition Execution Failed");
            throw e;
        }
    }
}

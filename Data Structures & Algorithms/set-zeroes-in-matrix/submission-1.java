class Solution {
    public void setZeroes(int[][] matrix) {
        int row0 = 1;

        // set row 0's tracker
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                row0 = 0;
                break;
            }
        }

        // set tracking vals in matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // rows to 0
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // columns to 0
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // first row to 0
        if (row0 == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}

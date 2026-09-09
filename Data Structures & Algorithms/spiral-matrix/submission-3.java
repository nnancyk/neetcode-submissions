class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int col = left; col <= right; col++) {
                output.add(matrix[top][col]);
            }

            for (int row = top + 1; row <= bottom; row++) {
                output.add(matrix[row][right]);
            }

            if (top == bottom || left == right) {
                break;
            }

            for (int col = right - 1; col >= left; col--) {
                output.add(matrix[bottom][col]);
            }

            for (int row = bottom - 1; row > top; row--) {
                output.add(matrix[row][left]);
            }

            top++;
            right--;
            bottom--;
            left++;            
        }

        return output;
    }
}

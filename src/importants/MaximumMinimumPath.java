package importants;

public class MaximumMinimumPath {

    private static int maximumMinimumPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = matrix[0][0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(matrix[i][0], dp[i - 1][0]);
        }

        for (int i = 1; i < m; i++) {
            dp[0][i] = Math.min(matrix[0][i], dp[0][i - 1]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int currMax = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.min(currMax, matrix[i][j]);
            }
        }

        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] d = new int[][]{
                {8,4,3,5},
                {6,5,9,8},
                {7,2,3,6}
        } ;
        System.out.println(maximumMinimumPath(d)); // 5
    }

}

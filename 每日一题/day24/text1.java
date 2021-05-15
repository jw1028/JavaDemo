import java.util.*;

public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        int n = board.length, m = board[0].length;
        int[][] f = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i - 1][j],f[i][j - 1]) + board[i - 1][j - 1];
            }
        }
        return f[n][m];
    }
}

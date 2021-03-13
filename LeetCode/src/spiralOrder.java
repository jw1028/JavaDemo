class Solution {
    public int[] spiralOrder(int[][] matrix) {
    if(matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, idx = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++) res[idx++] = matrix[t][i]; // left to right.
            if(++t > b) break;
            for(int i = t; i <= b; i++) res[idx++] = matrix[i][r]; // top to bottom.
            if(l > --r) break;
            for(int i = r; i >= l; i--) res[idx++] = matrix[b][i]; // right to left.
            if(t > --b) break;
            for(int i = b; i >= t; i--) res[idx++] = matrix[i][l]; // bottom to top.
            if(++l > r) break;
        }
        return res;
    }
}

class Solution {
    public int[] spiralOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int n = matrix.length, m = matrix[0].length;
        boolean[][] arr = new boolean[n][m];
        int x = 0, y = 0, d = 1;
        int[] ret = new int[m * n];
        int[]dx={-1,0,1,0};
        int[]dy={0,1,0,-1};
        for(int i = 0; i <n*m; i++){
            ret[i] = matrix[x][y];
            arr[x][y] = true;
            int a = x + dx[d], b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b >= m || arr[a][b]){
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return ret;
    }
}

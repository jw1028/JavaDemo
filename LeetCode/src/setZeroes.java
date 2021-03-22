class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0) return;
        int n = matrix.length;
        int m = matrix[0].length;
        boolean col = false, row = false;
        for(int i = 0; i < m; i++)
            if(matrix[0][i] == 0)
                row = true;
        for(int i = 0; i < n; i++)
            if(matrix[i][0] == 0)
                col = true;
        for(int i = 1; i < n; i++)
            for(int j = 1; j < m; j++)
                if(matrix[i][j] == 0)
                    matrix[0][j] = matrix[i][0] = 0;
        for(int i = 1; i < n; i++)
            for(int j = 1; j < m; j++)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
        if(col)
            for(int i = 0; i < n; i++)
                matrix[i][0] = 0;
        if(row)
            for(int i = 0; i < m; i++)
                matrix[0][i] = 0;
    }
}

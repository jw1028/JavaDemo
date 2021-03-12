class Solution {
    public boolean exist(char[][] board, String word) {
    for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                if(dfs(board, word.toCharArray(), 0, i, j))   return true;
       return false;
    }

    public boolean dfs(char[][] board, char[] word, int idx, int x, int y){
        if(board[x][y] != word[idx])  return false;
        if(idx == word.length - 1) return true;
        char tmp = board[x][y];
        board[x][y] = '*';

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{-1, 0, 1, 0};
        for(int i = 0; i < 4; i++){
            int a = dx[i] + x,b = dy[i] + y;
            if(a >= 0 && a < board.length && b >= 0 && b < board[a].length)
                if(dfs(board, word, idx + 1, a, b))    return true;
        }
        board[x][y] = tmp;
        return false;
    }
}

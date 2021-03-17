//dfs
class Solution {
        public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }
    private int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {
        if (i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 + j/10 + j%10) > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return dfs(i + 1, j, m, n, k, visited)+dfs(i, j + 1, m, n, k, visited)  + 1 ;
    }
}
//bfs
class Solution {
    public int movingCount(int m, int n, int k) {
    boolean[][] arr = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        int ret = 0;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while(!queue.isEmpty())
        {
            int[] tmp = queue.poll();
            if(tmp[0] < 0 || tmp[1] < 0 ||tmp[0] >= m || tmp[1] >= n || arr[tmp[0]][tmp[1]]) continue;
            if(digitsum(tmp[0]) + digitsum(tmp[1]) <= k)
            {
                arr[tmp[0]][tmp[1]] = true;
                ret++;
                for(int i = 0;i < 4;i++)
                {
                    queue.offer(new int[]{tmp[0]+dx[i],tmp[1]+dy[i]});
                }
            }
        }
        return ret;
    }

    public int digitsum(int k)
    {
        int sum = 0;
        while(k > 0)
        {
            sum += k % 10;
            k /= 10;
        }
       return sum;
    }
}

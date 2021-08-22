class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List<Integer> ret = new ArrayList<>();
        if(nums == null || nums.length == 0 || nums[0].length == 0) {
            return ret;
        }
        int n = nums.length, m = nums[0].length;
        int[] tmp = new int[n * m];
        boolean[][] arr = new boolean[n][m];
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int x = 0, y = 0, d = 1;
        for(int i = 0; i < n * m; i++) {
            ret.add(nums[x][y]);
            arr[x][y] = true;
            int a = x + dx[d], b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b >= m || arr[a][b]) {
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

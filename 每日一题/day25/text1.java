public class Solution {
    public int jumpFloorII(int n) {
        if(n < 2) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = 2 * arr[i - 1];
        }
        return arr[n];
    }
}

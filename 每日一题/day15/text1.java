public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int p = n + m - 1;
        m--;
        n--;
        while(n >= 0 && m >= 0) {
            if(A[m] >= B[n]) {
                A[p--] = A[m--];
            }else {
                A[p--] = B[n--];
            }
        }
        while(n >= 0) {
            A[p--] = B[n--];
        }
    }
}

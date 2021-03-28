import java.util.*;
public class NQueens {
    static int count = 0;
    static Scanner in = new Scanner(System.in);
    static int N = 20;
    static boolean[] col = new boolean[N], dg = new boolean[N], udg = new boolean[N];
    static char[][] arr = new char[N][N];
    static int n = 0;

    public static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dg[i - u + n] && !udg[i + u]) {
                arr[u][i] = 'Q';
                col[i] = dg[i - u + n] = udg[i + u] = true;
                dfs(u + 1);
                col[i] = dg[i - u + n] = udg[i + u] = false;
                arr[u][i] = '.';
            }
        }
    }
    public static void main(String[] args) {
        n = in.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) arr[i][j] = '.';
        dfs(0);
        System.out.println(count);
    }
}

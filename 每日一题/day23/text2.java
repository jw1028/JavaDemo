
import java.util.*;

public class Main
{
    static Scanner scan = new Scanner(System.in);
   
    public static void main(String args[])
    {
        while(scan.hasNext()) {
       
        String s1 = scan.next();
        int n = s1.length();
        char a[] = new char[n + 1];
        for(int i = 1; i <= n; i++) {
            a[i] = s1.charAt(i - 1);
        }
        // System.arraycopy(scan.next().toCharArray(), 0, a, 1, n);
        
        String s2 = scan.next();
        int m = s2.length();
        char b[] = new char[m + 1];
         for(int j = 1; j <= m; j++) {
            b[j] = s2.charAt(j - 1);
        }
         int f[][] = new int[n + 1][m + 1];
        // System.arraycopy(scan.next().toCharArray(), 0, b, 1, m);

        for (int i = 0; i <= n; i++) f[i][0] = i;
        for (int j = 0; j <= m; j++) f[0][j] = j;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
            {
                f[i][j] = Math.min(f[i - 1][j] + 1, f[i][j - 1] + 1);
                if (a[i] == b[j]) f[i][j] = Math.min(f[i][j], f[i - 1][j - 1]);
                else f[i][j] = Math.min(f[i][j], f[i - 1][j - 1] + 1);
            }
        System.out.println(f[n][m]);
        }
    }
}

import java.util.*;
public class Main{
    static int N = 1010;
    static Scanner scan = new Scanner(System.in);
    static int f[][]=new int[N][N];
    public static void main(String args[])
    {
       
        int n = scan.nextInt();
        int m = scan.nextInt();
        String s1 = " " + scan.next();
        String s2 = " " + scan.next();

        for(int i = 1; i <= n;i++)
            for(int j = 1; j <= m;j++)
                if(s1.charAt(i) != s2.charAt(j))
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                else
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);

        System.out.print(f[n][m]);
    }
}

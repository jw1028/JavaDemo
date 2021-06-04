import java.util.*;

public class Main
{
    static Scanner scan = new Scanner(System.in);
    static int N = 1010;
    static int a[] = new int[N], f[] = new int[N];

    public static void main(String args[])
    {
      while(scan.hasNext()) {
         int n = in.nextInt();
        for (int i = 1; i <= n; i++) a[i] = scan.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++)
        {
            f[i] = 1;
            for (int j = 1; j < i; j++)
            {
                if (a[j] < a[i])
                    f[i] = Math.max(f[i], f[j] + 1);
            }
            max = Math.max(max, f[i]);
        }
        System.out.println(max);
    }
      }
       
}


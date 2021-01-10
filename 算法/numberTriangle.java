import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] f=new int[510][510];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f[i][j]=scan.nextInt();
            }
        }
        
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                f[i][j]=Math.max(f[i+1][j],f[i+1][j+1])+f[i][j];
            }
        }
        System.out.println(f[1][1]);
    }
}

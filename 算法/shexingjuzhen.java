import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[110][110];
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        int x=0,y=0,d=1;
        for(int i=1;i<=n*m;i++)
        {
            arr[x][y]=i;
            int a=x+dx[d];
            int b=y+dy[d];
            if(a<0||a>=n||b<0||b>=m||arr[a][b]!=0)
            {
                d=(d+1)%4;
                a=x+dx[d];
                b=y+dy[d];
            }
            x=a;
            y=b;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
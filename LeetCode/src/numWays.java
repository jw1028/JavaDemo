//普通青蛙
//递归
public class Solution {
    public  int numWays(int n) {
        if (n <= 1)
            return 1;
        if (n < 3)
            return n;
        return f(n - 1) + f(n - 2);
    }
}
//动态规划
public class Solution {
    public int numWays(int n) {
        if(n<=1)
        {
            return 1;
        }
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
//动态规划优化
public class Solution {
    public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        // 两个变量表示前两项
        int f1 = 1, f2 = 2;
        int fn=0;
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            // 更新变量，以便继续求解
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}

//变态青蛙

//暴力解法
public class Solution {
    public int JumpFloorII(int n) {
        return n <= 0 ? 0 : 1 << (n - 1);
        //return (int)Math.pow(2,n-1);
    }
}

//递归
public class Solution {
    public int JumpFloorII(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(n - 1);
        }
    }
}

//动态规划
public class Solution {
    public int JumpFloorII(int n) {

        if (n < 2) {
            return 1;
        }
        int[] arr=new int[n+1];
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=2*arr[i-1];
        }
        return arr[n];
    }
}

//动态规划优化
public class Solution {
    public int JumpFloorII(int n) {

        if (n < 2) {
            return 1;
        }
        int f1=1;
        int fn=0;
        for(int i=2;i<=n;i++)
        {
            fn=2*f1;
            f1=fn;
        }
        return fn;
    }
}


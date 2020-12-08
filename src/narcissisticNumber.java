import java.util.Scanner;
public class narcissisticNumber {
    public static void narcissisticSnumber(int n){
        for (int i = 1; i <= n ; i++) {
            int count = 0;//每个数字有几位数
            int tmp = i ;
            while (tmp != 0) {
                count++;
                tmp = tmp/10;
            }
            //count
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//999999
        narcissisticSnumber(n);
    }

}

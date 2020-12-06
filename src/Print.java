import java.util.Scanner;
public class Print {
    public static void Print(int n){
        if(n>9)
        {
            Print(n/10);
        }
        System.out.println(n%10);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Print(n);
    }
}

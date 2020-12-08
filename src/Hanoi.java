
import java.util.Scanner;
public class Hanoi {
    public static void move(char pos1,char pos2) {

        System.out.print(pos1+"->"+pos2 +" ");
    }

    public static void Hanoi(int n,char pos1, char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
            return;
        }else {
            Hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            Hanoi(n-1,pos2,pos1,pos3);
        }
    }

    public static void main1(String[] args) {
        /*Hanoi(1,'A','B','C');
        System.out.println();
        Hanoi(2,'A','B','C');
        System.out.println();*/
        Hanoi(64,'A','B','C');
        System.out.println();
    }
}

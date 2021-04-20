
import java.util.*;
public class Main{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
StringBuilder ret = new StringBuilder();
int j = str.length() - 1, i = j;
while(i >= 0) {
while(i >= 0 && str.charAt(i) != ' ') i--;
ret.append(str.substring(i + 1, j + 1) + " ");
while(i >= 0 && str.charAt(i) == ' ') i--;
j = i;
}
System.out.print(ret.toString().trim());
}
}

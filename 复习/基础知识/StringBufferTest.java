package 基础知识;

/**
 * String StringBuilder StringBuffer
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String string = "aaaaa";
        char[] ch = string.toCharArray();
        String string1 = String.valueOf(ch);
        System.out.println(string1);
        System.out.println(ch);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("apple");
        System.out.println(stringBuffer.reverse());
        // StringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("apple");
        System.out.println(stringBuilder.reverse());
    }
}

public class Test {
        //设置字符数组
        //可以添加任意不重复字符，提高能转换的进制的上限
        static char[] chs = new char[36];
        static {
            for(int i = 0; i < 10 ; i++) {
                chs[i] = (char)('0' + i);
            }
            for(int i = 10; i < chs.length; i++) {
                chs[i] = (char)('A' + (i - 10));
            }
        }
/*num       源数据字符串 
 fromRadix	源数据的进制类型 
 toRadix	源标进制类型*/
        static String transRadix(String num, int fromRadix, int toRadix) {
            int number = Integer.valueOf(num, fromRadix);
            StringBuilder scan = new StringBuilder();
            while (number != 0) {
                scan.append(chs[number%toRadix]);
                number = number / toRadix;
            }
            return scan.reverse().toString();
        }
        //测试
        public static void main(String[] args) {
            System.out.println(transRadix("10", 10, 16));
        }
}
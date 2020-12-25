

public class ArraytoString {

    public static String myToString(int[] array) {
        if(array == null) {
            return "[]";
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if( i != array.length-1) {
                ret = ret + ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        //System.out.println(Arrays.toString(array));
        System.out.println(myToString(null));

    }
}


     public static String reverse(String str){
         //字符串转数组
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            char tmp=ch[left];
            ch[left]=ch[right];
            ch[right]=tmp;
            left++;
            right--;
        }
        //数组转字符串
        return new String(ch);
        /*return str.valueOf(ch);
        return str.copyValueOf(ch);*/
    }
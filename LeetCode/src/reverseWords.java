class Solution {
    public String reverseWords(String s) {
       String[] words = s.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}




class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        char[] s_arr = s.toCharArray();
        int n = s_arr.length;
        // 翻转这个数组
        reverse(s_arr, 0, n - 1);
        System.out.println(new String(s_arr));
        // 翻转每个单词
        word_reverse(s_arr, n);
        System.out.println(new String(s_arr));
        // 去除多余空格
        return clean_space(s_arr, n);
    }

    private void reverse(char[] s_arr, int i, int j) {
        while (i < j) {
            char t = s_arr[i];
            s_arr[i++] = s_arr[j];
            s_arr[j--] = t;
        }
    }

    private void word_reverse(char[] s_arr, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            // 找到第一个首字母
            while (i < n && s_arr[i] == ' ') i++;
            j = i;
            // 末位置
            while (j < n && s_arr[j] != ' ') j++;
            reverse(s_arr, i, j - 1);
            i = j;
        }
    }

    private String clean_space(char[] s_arr, int n) {
        int i = 0;
        int j = 0;
        while (j < n) {
            while (j < n && s_arr[j] == ' ') j++;
            while (j < n && s_arr[j] != ' ') s_arr[i++] = s_arr[j++];
            while (j < n && s_arr[j] == ' ') j++;
            if (j < n) s_arr[i++] = ' ';
        }
        return new String(s_arr).substring(0, i);
    }
}
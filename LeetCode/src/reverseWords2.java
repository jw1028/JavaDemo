//拼接
class Solution {
    public String reverseWords(String s) {
    String[] strs=s.trim().split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=strs.length-1;i>=0;i--)
    {
        if(strs[i].equals("")) continue;
        sb.append(strs[i]+" ");
    }
    return sb.toString().trim();
    }
}
//双指针
class Solution {
    public String reverseWords(String s) {
     s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
}
public class Solution {

    public boolean isValid (String s) {
        // write code here
        int len = s.length();
        for(int i = 0; i < len; i++) {
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.length() == 0;
    }
}

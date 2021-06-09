public class Solution {
    public int rectCover(int target) {
        if(target < 1) {
            return 0;
        }else if(target <= 2) {
            return target;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for(int i = 3; i <= target; i++){
            //f3先更新
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            
            
        }
        return f3;
    }
}

public class Solution {
    public boolean IsContinuous(int [] numbers) {
         int max = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        int min = max;
        for(int i=0;i<numbers.length;i++){
            if(min>numbers[i] && numbers[i]!=0){
                min = numbers[i];
            }
        }
         
        // 记录每个数字出现的次数，看看有没有重复的数；
        int count = 0;
        for(int i=min;i<=max;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j] == i && numbers[j]!=0) count++;
            }
            if(count>1) return false;
            count = 0;
        }
         
        if(max-min<5) return true;
        else return false;
    }
}

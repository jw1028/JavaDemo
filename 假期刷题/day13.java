//合并区间
import java.util.*;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
         ArrayList<Interval> res=new ArrayList<>();
        if(intervals.size()==0) return res;
        //先对start排序
        intervals.sort((a,b) -> (a.start - b.start));//lambda表达式（按照区间的左端点排序）
        //结果中先放一个Interval
        res.add(intervals.get(0));
        int i=0;
        //将intervals中每一个的start与res的end比较，res.end>=intervals.start就更新，否则直接添加
        for(i=1;i<intervals.size();i++){
            int left=intervals.get(i).start;
            int right=intervals.get(i).end;
            if(res.get(res.size()-1).end<left){
                res.add(new Interval(left,right));
            }
            else{
                res.get(res.size()-1).end=Math.max( res.get(res.size()-1).end,right); 
            }
        }
        return res;
    }
}

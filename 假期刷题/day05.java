//全排列
class Solution {
    public List<List<Integer>> ret = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length == 0) {
            return ret;
        }
        int n = nums.length;
        boolean[] used = new boolean[n];
        dfs(nums, n, 0, used, ret, path);
        return ret;
    }
    public void dfs(int[] nums, int len, int depth, boolean[] used, List<List<Integer>> ret,
    List<Integer> path) {
        if(depth == len) {
            ret.add(new ArrayList<>(path));
        }
        for(int i = 0; i < nums.length; i++) {
            if(!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, len, depth + 1, used, ret, path);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    } 
}
//全排列II
class Solution {
    public List<List<Integer>> ret = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums == null ||nums.length == 0) {
            return ret;
        }
        int n = nums.length;
        Arrays.sort(nums);
        boolean[] used = new boolean[n];
        dfs(nums, n, 0, used, ret, path);
        return ret;
    }
    public void dfs(int[] nums, int len, int depth, boolean[] used, List<List<Integer>> ret, List<Integer> path ) {
         if (depth == len) {
            ret.add(new ArrayList<>(path));
            return;
        }
         for (int i = 0; i < len; ++i) {
            if (used[i]) {
                continue;
            }
          
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, used, ret, path);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
//字符串排列

class Solution {
    public String[] permutation(String s) {
    int len = s.length();
        if (len == 0) {
            return new String[0];
        }

        // 转换成字符数组是常见的做法
        char[] str = s.toCharArray();
        // 排序是为了去重方便
        Arrays.sort(str);

        // 由于操作的都是字符，使用 StringBuilder
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[len];
        // 为了方便收集结果，使用动态数组
        List<String> res = new ArrayList<>();
        dfs(str, len, 0, used, path, res);
        // 记得转成字符串数组
        return res.toArray(new String[0]);
    }

  
    private void dfs(char[] str, int len, int depth,boolean[] used,StringBuilder path,
List<String> res) {
        if (depth == len) {
            // path.toString() 恰好生成了新的字符对象
            res.add(path.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
                if (i > 0 && str[i] == str[i - 1] && !used[i - 1]) {
                    continue;
                }
                path.append(str[i]);
                used[i] = true;
                dfs(str, len, depth + 1, used, path, res);
                used[i] = false;
                path.deleteCharAt(path.length() - 1);
              
            }
        }
    }

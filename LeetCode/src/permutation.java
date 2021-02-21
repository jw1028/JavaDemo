class Solution {
    public String[] permutation(String s) {
        int len = s.length();
        if (len == 0) {
            return new String[0];
        }

        // 转换成字符数组是常见的做法
        char[] charArr = s.toCharArray();
        // 排序是为了去重方便
        Arrays.sort(charArr);

        // 由于操作的都是字符，使用 StringBuilder
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[len];
        // 为了方便收集结果，使用动态数组
        List<String> res = new ArrayList<>();
        dfs(charArr, len, 0, used, path, res);
        // 记得转成字符串数组
        return res.toArray(new String[0]);
    }

  
    private void dfs(char[] charArr, int len, int depth,boolean[] used,StringBuilder path,
List<String> res) {
        if (depth == len) {
            // path.toString() 恰好生成了新的字符对象
            res.add(path.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                if (i > 0 && charArr[i] == charArr[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                path.append(charArr[i]);
                dfs(charArr, len, depth + 1, used, path, res);
                // 递归完成以后，需要撤销选择，递归方法执行之前做了什么，递归方法执行以后就需要做相应的逆向操作
                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }
}
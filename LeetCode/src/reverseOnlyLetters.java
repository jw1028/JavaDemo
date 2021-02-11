class Solution {
 public String reverseOnlyLetters(String S) {
        Stack<Character> stack = new Stack();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                stack.push(c);

        StringBuilder ret = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ret.append(stack.pop());
            else
                ret.append(c);
        }

        return ret.toString();
    }
}
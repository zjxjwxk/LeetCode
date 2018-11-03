public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < len; i++) {
            StringBuilder temp = new StringBuilder();
            int j = 0;
            while (j < prefix.length() && j < strs[i].length()) {
                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    temp.append(prefix.charAt(j));
                    j++;
                } else {
                    break;
                }
            }
            prefix = temp.toString();
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}

package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix t = new LongestCommonPrefix();
        String [] str = {"flower","flow","flight"};
        System.out.println(t.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int gggg = strs[i].indexOf(prefix);
            while (strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length()-1);
            if(prefix.length() == 0)
                return "";

        }
        return prefix;
    }
}

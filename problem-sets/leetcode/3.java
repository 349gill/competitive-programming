import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        HashSet<Character> chars = new HashSet<Character>();        
        
        int i = 0, j = 0, max = 0;
        while (j < n) {
            if (chars.contains(s.charAt(j))) {
                chars.remove(s.charAt(i++));
            }
            else {
                chars.add(s.charAt(j++));
                max = Math.max(max, chars.size());
            }
        }
        return max;
    }
}
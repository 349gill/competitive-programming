class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        s2 += ' ';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> current = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s1.length(); i++) {
            if (map.get(s1.charAt(i)) != null) map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            else map.put(s1.charAt(i), 1);
            if (current.get(s2.charAt(i)) != null) current.put(s2.charAt(i), current.get(s2.charAt(i)) + 1);
            else current.put(s2.charAt(i), 1);
        }
        
        int i = 0, j = s1.length();
        for (; j < s2.length(); i++, j++) {
            if (map.equals(current)) return true;
            if (current.get(s2.charAt(i)) != null && current.get(s2.charAt(i)) > 1)
                current.put(s2.charAt(i), current.get(s2.charAt(i)) - 1);
            else current.remove(s2.charAt(i));
            if (current.get(s2.charAt(j)) != null)
                current.put(s2.charAt(j), current.get(s2.charAt(j)) + 1);
            else current.put(s2.charAt(j), 1);
        }
        return false;
    }
}
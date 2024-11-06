import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        if (sChars.length != tChars.length) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i=0; i < sChars.length; i++) {
            sMap.put(sChars[i], sMap.getOrDefault(sChars[i], 0) + 1);
            tMap.put(tChars[i], tMap.getOrDefault(tChars[i], 0) + 1);
        }

        return sMap.equals(tMap);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("car", "cat"));
    }
}

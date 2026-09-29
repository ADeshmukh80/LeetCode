class Solution {
    public int longestPalindrome(String s) {
        int c = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            if (mp.get(ch) % 2 == 1) {
                c++;
            } else {
                c--;
            }
        }
        if (c > 0) {
            return s.length() - c + 1;
        }
        return s.length();
    }
}
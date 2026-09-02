class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int l = 0;
        int maxLength = 0;

        for (int r = 0; r < s.length(); r++) {
            while (!chars.add(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }

            maxLength = Math.max(maxLength, chars.size());
        }

        return maxLength;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> substring = new HashMap<>();
        int l = 0;
        int maxLength = 0;
        int replace = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (substring.containsKey(c)) {
                substring.replace(c, substring.get(c) + 1);
            } else {
                substring.put(c, 1);
            }

            int freq = Collections.max(substring.values());
            replace = r - l + 1 - freq;

            while (replace > k) {
                char cl = s.charAt(l);
                substring.replace(cl, substring.get(cl) - 1);
                l++;
                replace = r - l + 1 - Collections.max(substring.values());
            }

            maxLength = Math.max(r - l + 1, maxLength);
        }

        return maxLength;
    }
}

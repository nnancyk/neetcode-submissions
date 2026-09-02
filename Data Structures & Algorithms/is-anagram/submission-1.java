class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        // O(n)
        for (char c : s.toCharArray()) {
            if (freq1.containsKey(c)) {
                int val = freq1.get(c);
                freq1.put(c, val + 1);
            } else {
                freq1.put(c, 1);
            }
        }

        // O(m)
        for (char c : t.toCharArray()) {
            if (freq2.containsKey(c)) {
                int val = freq2.get(c);
                freq2.put(c, val + 1);
            } else {
                freq2.put(c, 1);
            }
        }

        return freq1.equals(freq2);
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end ) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            Character c1 = Character.toLowerCase(s.charAt(start));
            Character c2 = Character.toLowerCase(s.charAt(end));

            if (c1 != c2) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

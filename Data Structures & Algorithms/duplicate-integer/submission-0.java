class Solution {
    public boolean hasDuplicate(int[] nums) {
        // number, frequency
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                return true;
            } else {
                frequency.put(nums[i], 1);
            }
        }

        return false;
    }
}
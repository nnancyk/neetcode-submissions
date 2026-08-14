class Solution {    
    public int[] twoSum(int[] nums, int target) {
        // key is pair needed, value is index
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (pairs.containsKey(val)) {
                ans[0] = pairs.get(val);
                ans[1] = i;
            } else {
                int pair = target - val;
                pairs.put(pair, i);
            }
        }

        return ans;
    }
}

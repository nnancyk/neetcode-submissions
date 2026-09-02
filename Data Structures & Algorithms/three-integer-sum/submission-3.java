class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // O(nlogn)
        List<List<Integer>> ans = new ArrayList<>();

        // O(n^2)
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
                
            while (j < k) {
                int currSum = nums[j] + nums[k];

                if (currSum == target) {
                    List<Integer> triplet = new ArrayList<Integer>(List.of(nums[i], nums[j], nums[k]));
                    ans.add(triplet);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (currSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }
}

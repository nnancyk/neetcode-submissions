class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int pair = target - numbers[i];
            int index = Arrays.binarySearch(numbers, pair);

            if (index >= 0 && index != i) {
                int[] ans = new int[] {i + 1, index + 1};
                Arrays.sort(ans);
                return ans;
            }
        }

        return new int[] {0, 0};
    }
}

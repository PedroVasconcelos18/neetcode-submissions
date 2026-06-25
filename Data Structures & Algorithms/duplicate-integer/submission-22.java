class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplication = false;
        int[] nums2 = nums;

        for (int x = 0; x < nums.length - 1; x++) {
            for (int j = nums.length - 1; j >= 0; j--) {

                if (nums[x] == nums[j] && x != j) {
                    hasDuplication = true;
                }

            }
        }

        return hasDuplication;
    }
}
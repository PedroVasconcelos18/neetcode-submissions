class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for (int x = 1; x < nums.length; x++) {
            int y = nums[nums.length - 1];

            if (x == y) {
                return true;
            }

            y--;
        }

        return false;

    }
}
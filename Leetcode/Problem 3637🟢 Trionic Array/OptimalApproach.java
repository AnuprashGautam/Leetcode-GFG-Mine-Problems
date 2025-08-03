class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0;
        int q = nums.length - 1;

        if (nums.length < 4)
            return false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            } else if (nums[i] > nums[i + 1]) {
                p = i;
                break;
            }
        }

        for (int i = p + 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            } else if (nums[i] < nums[i + 1]) {
                q = i;
                break;
            }
        }

        for (int i = q + 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        return ((p != 0) && (q != nums.length - 1)) ? true : false;
    }
}


// Time Complexity:- O(N)
// Space Complexity:- O(1)
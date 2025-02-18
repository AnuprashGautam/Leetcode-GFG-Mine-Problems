// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr_length=nums.length;
        int[] sol=new int[2];
        for (int i=0;i<arr_length;i++)
        {
            for (int j=i+1;j<arr_length;j++)
            {
                if (nums[i]+nums[j]==target)
                {
                    sol[0]=i;
                    sol[1]=j;
                }
            }
        }
        return sol;
    }
}

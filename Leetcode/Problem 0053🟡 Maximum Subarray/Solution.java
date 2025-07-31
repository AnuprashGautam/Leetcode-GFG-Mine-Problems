class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++)      // Start of the sub array.
        {
            for(int j=i; j<nums.length; j++)   // End of the sub array.
            {
                int currentSum=0;

                for(int k=i; k<=j; k++){        // Iteraing over the actual sub array.
                    if((currentSum+nums[k])>0)
                    {
                        currentSum+=nums[k];
                    }
                }

                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
};

// Time Complexity:- O(N^3)
// Space Complexity:- O(1)

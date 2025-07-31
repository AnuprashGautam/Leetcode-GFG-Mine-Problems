class OptimalSolution {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++)      // Start of the sub array.
        {
            sum+=nums[i];

            maxSum=Math.max(sum,maxSum)

            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }
};

// Time Complexity:- O(N)
// Space Complexity:- O(1)
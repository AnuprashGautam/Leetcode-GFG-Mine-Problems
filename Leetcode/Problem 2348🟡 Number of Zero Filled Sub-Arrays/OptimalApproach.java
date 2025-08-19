class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        for(int i=0; i<nums.length; i++)
        {
            long subArrayLength=0;
            while((i<=nums.length-1)&&(nums[i]==0))
            {
                subArrayLength++;
                i++;
            }
            count+=(subArrayLength*(subArrayLength+1))/2;
        }
        return count;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(1)
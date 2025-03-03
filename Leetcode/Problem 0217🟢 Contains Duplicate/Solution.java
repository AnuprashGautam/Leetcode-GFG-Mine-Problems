class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        boolean isTwice= false;

        Arrays.sort(nums);      // Sorting the array.

        for(int i=0; i<nums.length-1; i++)
        {
            if((nums[i]^nums[i+1])==0)
            {
                return true;
            }
        }

        return isTwice;
    }
}
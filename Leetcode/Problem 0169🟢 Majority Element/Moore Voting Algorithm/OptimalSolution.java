public class OptimalSolution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums[0];

        for(int i=0; i<nums.length; i++)
        {
            if(count==0 && i!=0 )
            {
                count++;
                n=nums[i];
            }else if(nums[i]==n){
                count++;
            }else if(nums[i]!=n){
                count--;
            }
        }

        return n;
    }
}

// Time Complexity:- O(n)
// Space Complexity:- O(1)
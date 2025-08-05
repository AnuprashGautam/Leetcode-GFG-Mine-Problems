class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct= new int[nums.length];
        int[] suffixProduct= new int[nums.length];
        int[] ans=new int[nums.length];
    
        int product=1;
        for(int i=0; i<nums.length; i++)
        {
            prefixProduct[i]=product*nums[i];
            product*=nums[i];
        }

        product=1;
        for(int j=nums.length-1 ; j>=0; j--)
        {
            suffixProduct[j]=product*nums[j];
            product*=nums[j];
        }

        for(int i=0; i<nums.length; i++)
        {
            if(i==0)
            {
                ans[i]=1*suffixProduct[i+1];
            }else if(i==nums.length-1){
                ans[i]=prefixProduct[i-1]*1;
            }else{
                ans[i]=prefixProduct[i-1]*suffixProduct[i+1];
            }
        }   

        return ans;
    }
}


// Time Complexity:- O(N)
// Space Complexity:- O(N)
import java.util.Arrays;

class MySolution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){     // Edge Case: Array with 1 element only
            return nums[0];
        }

        Arrays.sort(nums);

        int count=1;    // Frequency of majority element
        int n=0;      // Majority Element 

        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
                n=nums[i];
            }else if(count>nums.length/2){
                return n;
            }
        }

        return n;
    }
}

// Time Complexity:- O(logN*N)
// Space Complexity:- O(1)
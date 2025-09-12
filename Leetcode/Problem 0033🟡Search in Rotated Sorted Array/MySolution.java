class Solution {
    public static int binarySearch(int [] nums, int start, int end, int target){
        if(start>end)   return -1;

        int mid=(start+end)/2;
        if(nums[mid]==target)   return mid;
        else if(target<nums[mid])   return binarySearch(nums,start, mid-1, target);
        else return binarySearch(nums, mid+1, end, target);
    }

    public static int search(int[] nums, int target) {
        int rotations=0;

        while(!(nums[0]<=nums[nums.length-1]))
        {
            int temp=nums[nums.length-1];
            for(int i=nums.length-1; i>0; i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            rotations++;
        }

        int result=binarySearch(nums,0, nums.length-1, target);

        if(result==-1) return -1;

        if(rotations!=0)
        {
            result=(result+(nums.length-rotations))%nums.length;
        }
    
        return result;
    }
}

// Time Complexity:- O(N^2)
// Space Complexity:- O(1)
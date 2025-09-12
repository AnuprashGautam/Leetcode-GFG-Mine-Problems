class Solution {
    public static int binarySearch(int [] nums, int start, int end, int target){
        // Edge Case
        if(start>end)   return -1;

        // To overcome the problem of stackoverflow
        int mid=start+((end-start)/2);

        if(nums[mid]==target)
        {
            return mid;
        }

        // If left array is sorted
        if(nums[start]<=nums[mid])
        {
            if(nums[start]<=target && target<=nums[mid])
            {
                return binarySearch(nums, start, mid-1, target);
            }
            else
            {
                return binarySearch(nums, mid+1, end, target);
            }
        }
        // Right array is sorted
        else
        {
            if(nums[mid+1]<=target && target<=nums[end])
            {
                return binarySearch(nums, mid+1, end, target);
            }
            else
            {
                return binarySearch(nums, start, mid-1, target);
            }
        }
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}

// Time Complexity:- O(logN)
// Space Complexity:- O(1)
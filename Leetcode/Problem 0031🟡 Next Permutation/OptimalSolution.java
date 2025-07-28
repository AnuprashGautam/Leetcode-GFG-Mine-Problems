class OptimalSolution {
    public static void reverseArray(int[] arr, int start, int end)
    {
        while( start < end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public void nextPermutation(int[] nums) {
        int index=-1;

        // 1. Found the break point.
        for(int i=nums.length-2; i>=0; i--)
        {
           if(nums[i]<nums[i+1])        // Finding the dip
           {
                index=i;
                break;
           }
        }

        if(index!=-1)
        {
            for(int i=nums.length-1; i>index; i--)
            {
                if(nums[i]>nums[index])     // Finding the larger element than nums[index] but the smallest too.
                {
                    // 2. Swapping the numbers.
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;


                    // 3. Reversing the array from index +1 to end of the array.
                    reverseArray(nums, index+1, nums.length-1);
                    break;
                }
            }
        }else{
            reverseArray(nums, 0, nums.length-1);
        }
    }
}


// Time Complexity:- O(n)
// Space Complexity:- O(1)
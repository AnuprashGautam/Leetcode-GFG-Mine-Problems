class Solution {
    public static int highestElement(int[] arr, int start , int end)
    {
        int mid=(start+end)/2;

        int leftValue=(mid==start)?Integer.MIN_VALUE:arr[mid-1];
        int rightValue=(mid==end)?Integer.MIN_VALUE:arr[mid+1];
        int midValue=arr[mid];

        int ans=-1;

        if(start<=end)
        {
            if(leftValue<=midValue && midValue>=rightValue)    
            {
                ans=mid;
            }
            else if(leftValue>=midValue)  
            {
                ans=highestElement(arr, start, mid-1);
            }
            else if(midValue<=rightValue)  
            {
                ans=highestElement(arr, mid+1, end);
            }
        }
        return ans;
    }

    public int peakIndexInMountainArray(int[] arr) {
        return highestElement(arr, 0, arr.length-1);
    }
}

// Time Complexity:- O(N)
// Space Complexiyt:- O(N)      Due to recurssion stack
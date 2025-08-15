class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge Case: when window is bigger than the actual array
        if(k>nums.length) return new int[]{};

        int[] result=new int[nums.length - k + 1];
        Deque<Integer> deque=new ArrayDeque<>();

        for(int i=0, j=0; i < nums.length; i++)
        {
            // Poping the elements which are out of the window from the front of the deque.
            while((!deque.isEmpty()) && (deque.getFirst() <= i-k))
            {
                deque.pollFirst();
            }

            // Poping the element which are smaller or equal to the element from the back side of the deque.
            while((!deque.isEmpty()) && (nums[deque.getLast()] <= nums[i]))
            {
                deque.pollLast();
            }

            // Adding the element to the deque.
            deque.addLast(i);

            // Adding the element to the result list
            if(i >= k-1)
            {
                result[j]=nums[deque.getFirst()];
                j++;
            }
        }

        return result;
    }
}

// Time Complexity:- O(N)    n is the size of the main array
// Space Complexity:- O(k)   k is the lenghth of sliding window
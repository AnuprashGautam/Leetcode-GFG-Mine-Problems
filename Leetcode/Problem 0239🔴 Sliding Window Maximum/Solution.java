class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge Case: when window is bigger than the actual array
        if(k>nums.length) return new int[]{};

        int[] result=new int[nums.length-k+1];
        PriorityQueue<Integer> maxHeap= new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0, j=0; i < nums.length; i++)
        {
            // Pushing the first k elements in the priority queue.
            if(i<k-1)
            {
                maxHeap.add(nums[i]);
            }
            // Removing the (i-k)th element and now accessing the top element of the priority queue.
            else{
                maxHeap.add(nums[i]);
                result[j++]=maxHeap.peek();
                maxHeap.remove(nums[i-k+1]);
            }
        }

        return result;
    }
}

// Time Complexity:- O(Nlog(k))    where n is the length of the original array and log(k) is the complexity of performing operation on the priority queue.
// Space Complexity:- O(N)         N is somewhat similar to the size of the 'result' array
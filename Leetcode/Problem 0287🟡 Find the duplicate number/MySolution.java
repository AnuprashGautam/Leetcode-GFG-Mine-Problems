class MySolution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int answer=0;

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                answer= nums[i];
                break;
            }
            map.put(nums[i],1);
        }

        return answer;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(N)
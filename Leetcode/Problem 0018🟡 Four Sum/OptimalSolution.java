class OptimalSolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadraplets=new ArrayList<>();

        if((target<=Integer.MIN_VALUE) || (Integer.MAX_VALUE<=target))
        {
            return quadraplets;
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++)
        {
            if((i>0) && (nums[i]==nums[i-1])) continue;

            for(int j=i+1; j<nums.length; j++)
            {
                if((j>i+1) && (nums[j]==nums[j-1])) continue;
                
                int k=j+1;
                int l=nums.length-1;

                while(k<l)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum<target)
                    {
                        k++;
                    }else if(sum>target)
                    {
                        l--;
                    }else{
                        quadraplets.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                        k++;
                        l--;

                        while((k<l) && (nums[k]==nums[k-1])) k++;
                        while((k<l) && (nums[l+1]==nums[l])) l--;
                    }
                }
            }
        }

        return quadraplets;
    }
}

// Time Complexity:- O(N^3)
// Space Complexit:- O(1)
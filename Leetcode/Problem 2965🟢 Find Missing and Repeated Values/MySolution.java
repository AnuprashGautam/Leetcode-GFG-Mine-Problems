import java.util.HashMap;

class MySolution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int[] i : grid)
        {
            for(int j : i)
            {
                if(map.containsKey(j))
                {
                    ans[0]=j;       // Found the repeating element
                }
                map.put(j,1);   
            }
        }

        for(int i=1; i<=grid.length*grid.length ; i++)
        {
            if(!map.containsKey(i))
            {
                ans[1]=i;           // Found the missing value.
            }
        }

        return ans;
    }
}


// Time Complexity:- O(N*N)
// Space Complexity:- O(N*N)
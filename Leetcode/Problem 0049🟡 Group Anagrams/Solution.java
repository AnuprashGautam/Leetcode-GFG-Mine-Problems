class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int[][] charCount=new int[strs.length][26];

        // Matrix to hold the character count in each string of strs array
        for(int i=0; i<strs.length; i++)
        {
            char[] charArray=strs[i].toCharArray();
            for(char c: charArray)
            {
                charCount[i][c-'a']++;
            }
        }

        // Now, we are finding the correct matches
        for(int i=0; i<strs.length; i++)
        {
            List<String> matches=new ArrayList<>();

            for(int j=0; j<strs.length; j++)
            {
                if(Arrays.equals(charCount[i], charCount[j]))
                {
                    matches.add(strs[j]);
                }
            }
            if(!ans.contains(matches))
            {
                ans.add(matches);
            }
        }

        return ans;
    }
}

// Time complexity: O(n * k + n^2)
// Space complexity: O(n * k)
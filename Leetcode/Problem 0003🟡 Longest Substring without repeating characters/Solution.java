import java.util.HashMap;

class Solution{
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=null;
        int maxSize=0;

        for(int i=0; i<s.length(); i++)
        {
            map=new HashMap<>();
            int len=0;

            for(int j=i; j<s.length(); j++)
            {
                if(map.containsKey(s.charAt(j))) break;
                
                len=j-i+1;

                maxSize=Math.max(maxSize, len);

                map.put(s.charAt(j),1);
            }
        }

        return maxSize;
    }
}

// Time Complexity:- O(N^2)
// Space Complexity:- O(N)
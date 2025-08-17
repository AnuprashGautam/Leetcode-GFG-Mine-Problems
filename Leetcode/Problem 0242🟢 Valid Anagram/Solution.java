class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray1=s.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2=t.toCharArray();
        Arrays.sort(charArray2);

        if(charArray1.length==charArray2.length)
        {
            for(int i=0; i<charArray1.length; i++)
            {
                if(charArray1[i]!=charArray2[i])
                {
                    return false;
                }
            }
        }else{
            return false;
        }

        return true;
    }
}

// Time Complexity:- O(NlogN)
// Time Complexity:- O(N)
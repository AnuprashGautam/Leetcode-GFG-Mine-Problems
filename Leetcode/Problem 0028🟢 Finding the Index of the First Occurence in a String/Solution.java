class Solution {
    public int strStr(String haystack, String needle) {
        for (int i=0; i<haystack.length()+1-needle.length(); i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))        
            {
                if(haystack.substring(i,needle.length()+i).equals(needle) )
                    return i;
            }    
        }
        return -1;
    }
}
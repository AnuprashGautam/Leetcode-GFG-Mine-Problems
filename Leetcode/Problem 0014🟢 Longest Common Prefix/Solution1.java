class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        String prefixStr="";                                        // Variable to store the matched characters.

        int shortLen=Integer.MAX_VALUE;                             // To iterate the outer loop equal to the shortest string.

        for (String s: strs){                                       // Finding shorLen.
            if(s.length() <= shortLen){
                shortLen = s.length();
            }
        }

        for(int i=0; i < shortLen; i++)                             // To run the loop up to shortest string length.
        {
            boolean flag= false; 

            char c = strs[0].charAt(i);

            if(strs.length==1){                                    // Edge case: if the array contains only 1 string.
                return strs[0];
            }
            
            for(int k=1; k < strs.length; k++)                    // Comparing the element to the rest of the strings' elements.
            {
                if(c == strs[k].charAt(i)){
                    flag= true;
                }else{                                            // To handle the edge case: whenever it finds the unmatched character, it will simply return the prefixStr.
                    return prefixStr;
                }
            }

            if( flag == true)
            {
                prefixStr += c;
            }
        }
        return prefixStr;
    }
}
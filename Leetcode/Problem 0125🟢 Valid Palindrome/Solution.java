class Solution {
    public static boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();

        // Converting the uppercase to lowercase letters.
        s=s.toLowerCase();

        for(int i=0; i<s.length(); i++)
        {
            if(((97<=s.charAt(i))&&((s.charAt(i))<=122))    ||  ((48<=s.charAt(i))&&((s.charAt(i))<=57)))
            {
                sb.append(s.charAt(i));
            }
        }

        int start=0; 
        int end=sb.length()-1;

        while(start<end)
        {
            if(sb.charAt(start)!=sb.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(N)
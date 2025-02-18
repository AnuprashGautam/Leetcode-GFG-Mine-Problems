class Solution {
    public void reverseString(char[] s) {
        int len=s.length;

        for(int i=0;i<len/2;i++)
        {
            // Swapping the characters in the pair.
            char temp=s[i];
            s[i]=s[len-1-i];
            s[len-1-i]=temp;
        }
    }
}
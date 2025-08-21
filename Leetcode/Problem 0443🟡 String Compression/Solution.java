class Solution {
    public int compress(char[] chars) {
        // Edge case
        if(chars.length<=1)
        {
            return chars.length;
        }

        StringBuilder sb=new StringBuilder();
        int count=1;
        char tempChar=chars[0];

        for(int i=1; i<chars.length; i++)
        {
            if(tempChar==chars[i])
            {
                count++;
            }
            if(tempChar!=chars[i])
            {
                sb.append(tempChar);
                if(count!=1)
                {
                    sb.append(count);
                }
                tempChar=chars[i];
                count=1;
            }
            if(i==chars.length-1)
            {
                sb.append(tempChar);
                if(count!=1)
                {
                    sb.append(count);
                }
            }
        }

        //Copying the element from string builder to original array.
        for(int j=0; j<sb.length(); j++)
        {
            chars[j]=sb.charAt(j);
        }

        return sb.length();
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(N)
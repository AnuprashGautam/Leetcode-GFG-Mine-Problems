class Solution {
    public int compress(char[] chars) {
        int read=0, write=0;

        while(read < chars.length)
        {
            char currChar=chars[read];
            int count=0;

            // Finding the occurrences
            while(read < chars.length && currChar==chars[read])
            {
                read++;
                count++;
            }

            chars[write++]=currChar;

            if(count>1)
            {
                for(char c: Integer.toString(count).toCharArray())
                {
                    chars[write++]=c;
                }
            }
        }

        return write;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(1)
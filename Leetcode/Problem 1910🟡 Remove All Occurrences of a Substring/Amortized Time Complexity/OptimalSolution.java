class Solution {
    public String removeOccurrences(String s, String part) {
        char[] input=s.toCharArray();
        char[] target=part.toCharArray();
        char[] resultStack=new char[input.length];
        int stackSize=0;
        int targetLength=target.length;
        char targetEndChar=target[targetLength-1];

        for(char currentChar: input)
        {
            resultStack[stackSize++]=currentChar;

            if((stackSize>=targetLength)&&(currentChar==targetEndChar))
            {
                int i=stackSize-1; int j=targetLength-1;

                while((j>=0)&&(resultStack[i]==target[j]))
                {
                    i--;
                    j--;
                }

                if(j<0)
                {
                    stackSize=i+1;
                }
            }
        }

        return new String(resultStack, 0, stackSize);
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(N)
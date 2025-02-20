class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        // Sorting the array. Time comeplexoty : O(n*log(n))
        Arrays.sort(strs);

        // Getting the first and last strings in the form of arrays using toCharArray() method.
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i < first.length; i++)
        {
            if(first[i] != last[i])
            {
                break;
            }
            result.append(first[i]);
        }

        return result.toString();
    }
}


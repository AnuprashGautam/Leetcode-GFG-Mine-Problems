class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.indexOf(part)!=-1)
        {
            s=s.replace(part,"");
        }

        return s;
    }
}

// This code doesn't pass all the test cases due to the way replace method works. It doesn't replace one occurrence, but all at once.
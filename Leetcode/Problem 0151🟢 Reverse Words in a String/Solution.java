class Solution {
    public String reverseWords(String s) {
        // Split the string by one or more spaces
        String[] strArray = s.trim().split("\\s+");

        int start = 0;
        int end = strArray.length - 1;

        // Reverse the words
        while (start < end) {
            String temp = strArray[end];
            strArray[end] = strArray[start];
            strArray[start] = temp;
            start++;
            end--;
        }

        // Join with single space
        return String.join(" ", strArray);
    }
}


// Time Complexity:- O(N)
// Space Complexity:- O(N)
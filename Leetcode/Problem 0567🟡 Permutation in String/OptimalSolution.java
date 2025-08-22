import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Base case: s1 can't be longer than s2
        if (s1.length() > s2.length()) return false;

        int[] searchCharacterFrequency = new int[26];
        int[] windowCharacterFrequency = new int[26];

        // Build the frequency array for s1
        for (char c : s1.toCharArray()) {
            searchCharacterFrequency[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            // Add current char to window
            windowCharacterFrequency[s2.charAt(i) - 'a']++;

            // Remove leftmost char when window size exceeds s1.length()
            if (i >= s1.length()) {
                windowCharacterFrequency[s2.charAt(i - s1.length()) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(searchCharacterFrequency, windowCharacterFrequency)) {
                return true;
            }
        }

        return false;
    }
}


// Time Complexity:- O(N)
// Space Complexity:- O(1)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum of 0 occurs once

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum - k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}


// Time Complexity:- O(n)
// Time Complexity:- O(n)
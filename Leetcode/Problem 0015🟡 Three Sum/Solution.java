class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] triplet = new int[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(triplet); // to handle duplicates
                        set.add(Arrays.asList(triplet[0], triplet[1], triplet[2]));
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}


// Time Complexity:- O(n^3)
// Space Complexity:- O(n^3)
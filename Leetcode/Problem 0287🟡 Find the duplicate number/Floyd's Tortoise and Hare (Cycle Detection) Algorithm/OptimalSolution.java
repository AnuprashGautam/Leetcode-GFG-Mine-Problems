class OptimalSolution {
    public int findDuplicate(int[] nums) {
        int slow=0; 
        int fast=0;

        // Fast will move with double speed than the slow until they don't meet.
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        // After they meet, slow will be set to the beginning and fast will move with the linear speed.
        slow=0;

        do{
            slow=nums[slow];
            fast=nums[fast];
        }while(slow!=fast);

        return slow;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(1)
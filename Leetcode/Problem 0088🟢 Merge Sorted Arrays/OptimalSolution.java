class OptimalSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left=m-1;
        int right=0;

        while(left>0 && right<n)
        {
            if(nums1[left] > nums2[right])
            {
                // Swaping the elements
                int temp=nums1[left];
                nums1[left]=nums2[right];
                nums2[right]=temp;

                left--; 
                right++;
            }else{
                break;
            }
        }

        Arrays.sort(nums2);     // Sorted the nums2 array: O(nlogn)

        for(int i=m, j=0; i<m+n; i++, j++)
        {
            nums1[i]=nums2[j];
        }

        Arrays.sort(nums1);     // Sorted the nums1 array: O(nlogn)
    }
}


// Time Complexity:- O((m+n)log(m+n))
// Space Complexity:- O(1)
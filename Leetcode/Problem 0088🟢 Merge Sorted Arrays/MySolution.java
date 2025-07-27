class MySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0; i<nums2.length; i++)
        {
            for(int j=0; j<nums1.length; j++)
            {
                if(nums1[j]==0 && (j+1>m+i))
                {
                    nums1[j]=nums2[i];
                    break;
                }
                else if(nums2[i]==nums1[j]){
                    for(int k=nums1.length-1; k>j; k--)
                    {
                        nums1[k]=nums1[k-1];
                    }
                    nums1[j]=nums2[i];
                    break;
                }
                else if(nums2[i]<nums1[j]){
                    for(int k=nums1.length-1; k>j; k--)
                    {
                        nums1[k]=nums1[k-1];
                    }
                    nums1[j]=nums2[i];
                    break;
                }
            }
        }
    }
}


// Time Complexity:- O(n*m*m)
// Space Complexity;- O(1)
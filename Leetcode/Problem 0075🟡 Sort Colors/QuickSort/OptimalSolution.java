class OptimalSolution {
    public static int partition(int[] arr, int start, int end)
    {
        int x=arr[start];       // Pivot Element
        int i=start;        // i is used to determine the correct location of the pivot element.

        for(int j=start+1; j<=end; j++)     // j is used for the comparision of the array element with the pivot element.
        {
            if(arr[j]<=x)
            {
                i=i+1;
                // Swaping the elements present at i an j.
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        // Swaping the element present at i with pivot.
        int temp=arr[start];
        arr[start]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void quickSort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int m=partition(arr, start, end);
            quickSort(arr, start, m-1);
            quickSort(arr, m+1, end);
        }
    }

    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }
}
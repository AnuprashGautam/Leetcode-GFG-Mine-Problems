class Solution {
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        return mergeSort(nums, temp, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(arr, temp, left, mid) +
                    mergeSort(arr, temp, mid + 1, right);

        // Count reverse pairs
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merge step
        merge(arr, temp, left, mid, right);
        return count;
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy merged part back
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}


// Time Complexity:- O(NlogN)
// Space Complexity:- O(N)
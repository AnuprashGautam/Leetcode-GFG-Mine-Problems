
class Solution {
    public static int merge(int[] arr, int p, int q, int r) {
        int inversions = 0;

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[q + 1 + j];
        }

        // Counting reverse pairs
        int i = 0, j = 0;
        int count = 0;
        for (i = 0, j = 0; i < n1; i++) {
            while (j < n2 && (long) L[i] > 2L * (long) R[j]) {
                j++;
            }
            count += j;
        }
        inversions += count;

        // Merging without sentinels
        i = 0;
        j = 0;
        int k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }

        return inversions;
    }

    public static int mergeSort(int[] arr, int p, int r) {
        int ans = 0;
        if (p < r) {
            int q = (p + r) / 2;
            ans += mergeSort(arr, p, q);
            ans += mergeSort(arr, q + 1, r);
            ans += merge(arr, p, q, r);
        }
        return ans;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}


// Time Complexity:- O(NlogN)
// Space Complexity:- O(N)
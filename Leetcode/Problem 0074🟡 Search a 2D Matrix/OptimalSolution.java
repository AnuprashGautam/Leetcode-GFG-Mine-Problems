class Solution {
    public static int rowBinarySearch(int[][] arr, int start, int end, int target)
    {
        if(start> end)
        {
            return -1;
        }

        int mid=(start+end)/2;

        if((arr[mid][0]<=target) && (target<=arr[mid][arr[mid].length-1]))
        {
            return mid;
        }
        else if(target< arr[mid][0])
        {
            return rowBinarySearch(arr, start, mid-1, target);
        }
        else if(target > arr[mid][arr[mid].length-1]){
            return rowBinarySearch(arr, mid+1, end, target);
        }

        return -1;
    }

    public static int columnBinarySearch(int[] arr, int start, int end, int target)
    {
        if(start> end)
        {
            return -1;
        }
        
        int mid=(start+end)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        else if(target< arr[mid])
        {
            return columnBinarySearch(arr, start, mid-1, target);
        }
        else if(target > arr[mid]){
            return columnBinarySearch(arr, mid+1, end, target);
        }

        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int correctRow=rowBinarySearch(matrix, 0, matrix.length-1, target);

        if(correctRow!=-1)
        {
            int correctColumn=columnBinarySearch(matrix[correctRow],0, matrix[correctRow].length-1, target);
            if(correctColumn!=-1)
            {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}


// Time Complexity:- O(logM + logN)  or O(log(M*N))
// Space Complexity:- O(1)
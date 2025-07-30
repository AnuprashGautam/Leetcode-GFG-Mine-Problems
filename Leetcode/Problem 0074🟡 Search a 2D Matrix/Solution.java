class OptimalSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int i=rows-1;
        int j=0;

        while (i!=-1 && j!=cols)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]>target)
            {
                // Move up
                i--;
            }else if(matrix[i][j] < target)
            {
                // Move right
                j++;
            }
        }

        return false;
    }
}


// Time complexity:- O(rows+cols)
// Space Complexity:- O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length-1;
        int c=0;

        while((r>-1)&&(c<matrix[0].length))
        {
            if( target == matrix[r][c])
            {
                return true;
            }

            // Move up
            else if(target < matrix[r][c])
            {
                r--;
            }

            // Move right
            else if( target > matrix[r][c])
            {
                c++;
            }
        }

        return false;
    }
}


// Time complexity:- O(M+N)
// Space Complexity:- O(1)
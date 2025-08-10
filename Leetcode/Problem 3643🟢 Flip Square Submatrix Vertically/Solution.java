class Solution {
    
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int mid = x + (k / 2) - 1;
        int lowerRow = x + k - 1;

        for (int i = x; i <= mid; i++) {
            for (int j = y; j < y + k; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[lowerRow][j];
                grid[lowerRow][j] = temp;
            }
            lowerRow--;
        }
        return grid;
    }
}


// Time Complexity:- O(k^2)
// Space Complexity:- O(1)
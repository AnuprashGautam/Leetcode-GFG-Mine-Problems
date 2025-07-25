class OptimalSolution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // Ideal Array is the array in which every element is present for one time only.
        // Sum of n numbers of ideal array: n(n+1)/2
        long n=grid[0].length*grid[0].length;

        long idealSum=n*(n+1)/2;                      // y
        long idealSquareSum=(n)*(n+1)*(2*n+1)/6;        // y2

        // Actual array is the given array.
        long actualSum=0;                            // x
        long actualSquareSum=0;                      // x2

        for(int[] i : grid)
        {
            for(int j : i)
            {
                actualSum+=j;
                actualSquareSum+=j*j;
            }
        }
        
        // x: Repeating Value and y: Missing Value
        long xMINUSy= actualSum-idealSum;               // x-y
        long x2MINUSy2= actualSquareSum-idealSquareSum; // x2-y2
        long xPLUSy= x2MINUSy2/xMINUSy;                 // x+y
        long x=(xMINUSy+xPLUSy)/2;                      // x
        long y=xPLUSy-x;                                // y

        return new int[]{(int)x,(int)y};
    }
}

// Time Complexity:- O(N*N)
// Space Complexity:- O(1)
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int rightBoundary = matrix[0].length - 1;
        int leftBoundary = 0;
        int topBoundary = 0;
        int bottomBoundary = matrix.length - 1;

        while ((topBoundary <= bottomBoundary) && (leftBoundary <= rightBoundary)) {
            // Moving right side
            for (int i = leftBoundary; i <= rightBoundary; i++) {
                list.add(matrix[topBoundary][i]);
            }

            // Moving down side
            for (int i = topBoundary+1; i <= bottomBoundary; i++) {
                list.add(matrix[i][rightBoundary]);
            }

            // Moving left side
            for (int i = rightBoundary-1; i >= leftBoundary; i--) {
                if(topBoundary==bottomBoundary)
                {
                    break;
                }

                list.add(matrix[bottomBoundary][i]);
            }

            // Moving top side
            for (int i = bottomBoundary-1; i > topBoundary; i--) {
                if(leftBoundary==rightBoundary)
                {
                    break;
                }
                list.add(matrix[i][leftBoundary]);
            }

            topBoundary++;
            leftBoundary++;
            bottomBoundary--;
            rightBoundary--;
        }

        return list;
    }
}


// Time Complexit:- O(m*n)
// Space Complexity:- O(1)
class Solution {
    public void rotate(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();

        int rows=matrix.length;
        int cols=matrix[0].length;

        int rowStart=0;
        int colStart=0;
        int rowEnd=rows-1;
        int colEnd=cols-1;

        while((rowStart<=rowEnd)&&(colStart<=colEnd))
        {
            // Up
            for(int i=rowEnd; i>=rowStart; i--)
            {
                list.add(matrix[i][colStart]);
            }

            // Right
            for(int i=colStart+1; i<=colEnd; i++)
            {
                list.add(matrix[rowStart][i]);
            }

            // Down
            for(int i=rowStart+1; i<=rowEnd; i++)
            {
                list.add(matrix[i][colEnd]);
            }

            // Left
            for(int i=colEnd-1; i>colStart; i--)
            {
                list.add(matrix[rowEnd][i]);
            }

            rowStart++; colStart++; rowEnd--; colEnd--;
        }

        rowStart=0;
        colStart=0;
        rowEnd=rows-1;
        colEnd=cols-1;

        int index=0;

        while((rowStart<=rowEnd)&&(colStart<=colEnd))
        {
            // Right
            for(int i=colStart; i<=colEnd; i++)
            {
                matrix[rowStart][i]=list.get(index++);
            }

            // Down
            for(int i=rowStart+1; i<=rowEnd; i++)
            {
                matrix[i][colEnd]=list.get(index++);
            }

            // Left
            for(int i=colEnd-1; i>=colStart; i--)
            {
                matrix[rowEnd][i]=list.get(index++);
            }

            // Up
            for(int i=rowEnd-1; i>rowStart; i--)
            {
                matrix[i][colStart]=list.get(index++);
            }

            rowStart++; colStart++; rowEnd--; colEnd--;
        }
    }
}


// Time Complexity:- O(N^2)
// Space Complexity:- O(N^2)
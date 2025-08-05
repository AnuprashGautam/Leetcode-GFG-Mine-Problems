class Solution {
    public static boolean dfs(char[][] board, int r, int c, String word, int wordIndex)
    {
        // BASE CASES
        if(wordIndex==word.length())  return true;

        // Out of bound cases
        int rows=board.length;
        int cols=board[0].length;

        if(r<0 || c<0 || r>=rows || c>=cols)   return false;

        // invalid case
        if ((board[r][c]==' ') || (board[r][c]!=word.charAt(wordIndex)))    return false;

        // mark as visited
        char ch=board[r][c];
        board[r][c]=' ';

        // dfs calls
        boolean up=dfs(board, r-1, c, word, wordIndex+1);
        boolean down=dfs(board, r+1, c, word, wordIndex+1);
        boolean right=dfs(board, r, c+1, word, wordIndex+1);
        boolean left=dfs(board, r, c-1, word, wordIndex+1);

        if( up || down || right || left )
        {
            return true;
        }

        // Backtracking 
        board[r][c]=ch;

        return false;
    }

    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if((board[i][j]==word.charAt(0))&&(dfs(board, i, j, word, 0)))
                {
                    return true;
                }
            }
        }
        return false;
    }
}

// Time complexity: O(M * N * 4^L)
// Space complexity: O(L)
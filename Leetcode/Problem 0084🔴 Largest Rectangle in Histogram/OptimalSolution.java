class Solution {
    public int largestRectangleArea(int[] heights) {
        // Edge case: when there is only one element
        if(heights.length==1)
        {
            return heights[0];
        }

        int maxArea=Integer.MIN_VALUE;

        int[] left=new int[heights.length];
        int[] right=new int[heights.length];
        Stack<Integer> s=new Stack<>();

        // Calculaing the right smaller value for the element in the heights array
        for(int i=heights.length-1; i>=0; i--)
        {
            while((s.size()>0) && (heights[s.peek()]>=heights[i]))
            {
                s.pop();
            }

            right[i]=s.size()==0 ? heights.length : s.peek();

            s.push(i);
        }

        // Emptying the stack for the future use
        while(s.size()!=0)
        {
            s.pop();
        }

        // Calculaing the left smaller value for the element in the heights array
        for(int i=0; i<heights.length; i++)
        {
            while((s.size()>0) && (heights[s.peek()]>=heights[i]))
            {
                s.pop();
            }

            left[i]=s.size()==0 ? -1 : s.peek();

            s.push(i);
        }

        // Calculating the max area
        for(int i=0; i<heights.length; i++)
        {
            int currArea=0;

            int h=heights[i];
            int w=right[i]-left[i]-1;

            // Calculating the current area
            currArea=h*w;

            if(currArea >= maxArea)
            {
                maxArea=currArea;
            }
        }

        return maxArea;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(1)
class Solution {
    public static int trap(int[] heights)
    {
        int width=1;        // Tower width

        // Auxilliary Arrays
        // 1. To calculate the heighest left-most tower.
        int[] leftTallestTower= new int[heights.length];
        leftTallestTower[0]= heights[0];
        for (int i = 1; i < heights.length; i++) 
        {
            if(leftTallestTower[i-1]>=heights[i])
            {
                leftTallestTower[i]=leftTallestTower[i-1];
            }else{
                leftTallestTower[i]=heights[i];
            }
        }


        // 2. To calculate the heighest right-most tower.
        int[] rightTallestTower= new int[heights.length];
        rightTallestTower[rightTallestTower.length-1]= heights[heights.length-1];
        for (int i = heights.length-2; i >= 0; i--) 
        {
            if(rightTallestTower[i+1]>=heights[i])
            {
                rightTallestTower[i]=rightTallestTower[i+1];
            }else{
                rightTallestTower[i]=heights[i];
            }
        }

        int volume=0;   // To store the sum of water collected wrt to every tower.

        if(heights.length==0 || heights.length==1 || heights.length==2)
        {
            return volume;
        }
        else                // 3 or more than 3 towers are present.
        {
            for (int i = 1; i < heights.length-1; i++) 
            {
                int waterLevel= Math.min(leftTallestTower[i],rightTallestTower[i]);
                int towerWater=(waterLevel-heights[i])*width;
                if (towerWater < 0)
                {
                    volume +=0;
                }    
                else
                {
                    volume +=towerWater;
                }       
            }
        }

        return volume;
    }
}
class Solution {
    public int maxArea(int[] height) {

        int vol=0;
        int i=0;
        int j=height.length-1;

        while(i<j)
        {
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int cVol=h*w;

            vol=Math.max(vol,cVol);

            if(height[i]<height[j])
            {
                i++;
            }
            else        // height[i]>=height[j]
            {
                j--;
            }
        }

        return vol;
    }
}public class Solution {
    
}

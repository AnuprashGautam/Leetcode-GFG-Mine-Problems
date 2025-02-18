class Solution {
    public int reverse(int x) {
        int tempX = x;
        long reversedNumber=0;

        while(tempX != 0)
        {
            int remainder = tempX % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempX /= 10;
        }

        int lowerLimit = - (int) Math.pow(2,31);
        int upperLimit = (int) Math.pow(2,31) - 1;

        if (!( lowerLimit <=reversedNumber & reversedNumber <= upperLimit ))
        {
            return 0;
        }

        return (int)reversedNumber;
    }
}
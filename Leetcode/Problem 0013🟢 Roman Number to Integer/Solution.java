class Solution {
    public static int getValue(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) 
    {
        int n=s.length();                // Calculating the string length.
        int sum=0;                       // final integer value.

        for(int i=0;i<n;i++)
        {
            char ch1=s.charAt(i);

            // (i+1)<n this condition check if the next character is present in the string or not.
            if((i+1)<n && getValue(s.charAt(i))<getValue(s.charAt(i+1)))
            {
                sum-=getValue(s.charAt(i));
            }else{
                sum+=getValue(s.charAt(i));
            }
        }

        return sum;
    }
}

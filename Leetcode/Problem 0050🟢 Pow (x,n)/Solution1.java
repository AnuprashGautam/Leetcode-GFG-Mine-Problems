class Solution1 {
    public double myPow(double x, int n) {
        double rPosPow = x;
        double rNegPow = 1;

        if(n==0 || x==1)
        {
            return 1;
        }
        else if( x == -1)
        {
            if(Math.abs(n)%2==0)
                return 1;
            else
                return -1;
        }

        else if( n == -2147483648 )
        {
            return 0;
        }
        else if(n > 0)
        {
            for(int i=1; i<n; i++)
            {
                rPosPow *=x;
            }
            return rPosPow;
        }
        else if(n < 0)
        {
            for(int i=1; i<=Math.abs(n); i++)
            {
                rNegPow /=x;
            }
            return rNegPow;
        }

        return 1;
    }
}
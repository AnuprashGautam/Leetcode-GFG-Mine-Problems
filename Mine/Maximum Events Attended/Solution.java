public class Solution
{
    public static void main (String[] args)
    {
        int[] startingTime={1,2,5,6};
        int[] endingTime={2,5,6,7};

        int eventsAttended=1;

        for(int i=0,j=1; i<endingTime.length-1;)
        {
            if(startingTime[j]>=endingTime[i])
            {
                eventsAttended++;
                i=j;
                j++;
            }else{
                j++;
            }
        }

        System.out.println("The maximum events a person can attend is: "+eventsAttended);
    }
}
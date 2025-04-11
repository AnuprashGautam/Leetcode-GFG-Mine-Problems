class Solution{
    public static int frequentElement(int[] arr)
    {   
        int maxCount=0;
        int maxCountElement=-1;
        int count=1;

        if(arr.length==1)
        {
            return arr[0];
        }
        
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1] && i==arr.length-2)
            {
                return (maxCount>count)?maxCountElement:arr[i];
            }
            else if(arr[i]==arr[i+1])
            {
                count++;
            }
            else if(arr[i]!=arr[i+1] && maxCount<count)
            {
                maxCountElement=arr[i];
                maxCount=count;
                count=1;
            }
        }
        
        return maxCountElement;
    }
    
    public static void main(String[] args)
    {
        int[] arr={2};
        int result=frequentElement(arr);

        System.out.println("The element with the maximum frequency in this array is: "+result);
    }
}
public class Test {
    public static boolean isPrime(int n)
    {
        if(n==2){
            return true;
        }else if(n==1 || n==0)
        {
            return false;
        }

        boolean prime=true;

        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return prime;
    }

    public static int maxBooks(int[] shelves, int totalShelves, int capacity){
        int totalBooks=0;
        for(int i=0;i<shelves.length;i++)
        {
            if(isPrime(i+1))
            {
                totalBooks+=Math.min(capacity, shelves[i]);
            }
        }
        return totalBooks;
    }


    public static void main(String[] args) {
        System.out.println(maxBooks(new int[]{10,2},2, 4));
    }
}

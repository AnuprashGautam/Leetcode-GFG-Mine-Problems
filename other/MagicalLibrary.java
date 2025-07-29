public class MagicalLibrary{
    public static void main(String[] args) {
        int [][] shelf={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        
        int count=0;
        for(int[] row: shelf)
        {
            int sum=0;
            for(int i=0; i< row.length; i++){
                if(row[i]%2==1)
                {
                    sum+=row[i];
                }
            }

            if(sum%2==0)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
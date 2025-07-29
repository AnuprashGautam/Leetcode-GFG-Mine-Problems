public class Test1 {
    public static void main(String[] args)
    {
        int fiveCount=0;
        int students=7;
        int total=students*(students+1)/2;

        if(students%5==0)
        {
            total=total+4;
        }

        for(int i=1; i<students; i++)
        {
            if(i%5==0)
            {
                fiveCount++;
            }
        }

        total=total+(4*fiveCount);

        System.out.println(total);

        System.out.println("Fives are:"+fiveCount);
    }
}

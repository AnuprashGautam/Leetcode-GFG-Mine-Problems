import java.util.Arrays;

public class KnowledgeEnhancement {
    public static void main(String[] args) {
        int maxHours=5;
        int[] books={4,2,3,1};
        int count=0;
        int sum=0;

        Arrays.sort(books);

        for(int x: books)
        {
            if(sum+x<=maxHours)
            {
                sum+=x;
                count++;
            }
        }

        System.out.println(count);

    }
}

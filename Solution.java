import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] mergeArrays(int[] a, int[] b){
        int[] c=new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;

        while((i<a.length) && (j<b.length))
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }else if(b[j]<a[i]){
                c[k++]=b[j++];
            }else{
                c[k++]=a[i];

                i++;
                j++;
            }
        }

        if(i<a.length-1)
        {
            for(;i<a.length;i++)
            {
                c[k++]=a[i];
            }
        }else if(j<b.length-1)
        {
            for(;j<b.length;j++)
            {
                c[k++]=a[j];
            }
        }

        return c;
    }
    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0; i<intervals.length; i++)
        {
            if(intervals[i][intervals[i].length-1] > intervals[i+1][0])     // Overlapping occured
            {
                int[] newArr=mergeArrays(intervals[i], intervals[i+1]);
                List<Integer> row=new ArrayList<>();
                for(int e: newArr){
                    row.add(e);
                }
                result.add(row);
            }
        }

        for(int i=0; i<result.size(); i++)
        {
            for(int j=0; j<result.get(i).size(); j++)
            {
                intervals[i][j]=result.get(i).get(j);
            }
        }

        return intervals;
    }
    
    public static void main(String[] args)
    {
        int[][] intervals=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        
        intervals=merge(intervals);
        
        System.out.println(intervals);
    }
}
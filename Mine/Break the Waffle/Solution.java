import java.util.Scanner;

public class Solution
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        int c;
        int hCost;
        int vCost;
        int totalCost;

        System.out.print("Enter the no of rows in waffle: ");
        r=sc.nextInt();

        System.out.print("Enter the no of columns in waffle: ");
        c=sc.nextInt();

        System.out.print("What is the cost to break the waffle horizontally? ");
        hCost=sc.nextInt();

        System.out.print("What is the cost to break the waffle vertically? ");
        vCost=sc.nextInt();

        if(vCost>=hCost)
        {
            totalCost=(c-1)*vCost;
            totalCost+=c*(r-1)*hCost;
        }
        else
        {
            totalCost=(r-1)*hCost;
            totalCost+=r*(c-1)*vCost;
        }

        System.out.println("The minmum cost to break the waffle is: "+totalCost);
    }
}
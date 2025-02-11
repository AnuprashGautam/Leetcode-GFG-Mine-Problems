import java.util.Scanner;

public class Logic1 {
    static void swap(int a,int b)
    {
        System.out.println("Before swapping:"+a+" "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping:"+a+" "+b);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a=scanner.nextInt();

        System.out.print("Enter the second number:");
        int b=scanner.nextInt();

        swap(a, b);
    }
}

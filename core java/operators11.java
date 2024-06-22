import java.util.Scanner;

public class operators11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
         int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The Swipped values are:");
        System.out.println(a +" "+ b);
//        using third variable
//        a=b;
//        int c=a;
//        b=c;
    }
}

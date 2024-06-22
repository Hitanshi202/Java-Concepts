public class Divisible
{
    public static void main(String[] args)
    {
        int num=20;
        if(num==0)
        {
            System.out.println("it is divisible by all numbers");
        }
        else if(num%2==0)
        {
            System.out.println("it is divisible by 2");
        }
        else if(num%3==0)
        {
            System.out.println("it is divisible by 3");
        }
        else if(num%5==0)
        {
            System.out.println("it is divisible by 5");
        }
        else
        {
            System.out.println("it is not divisible");
        }
    }
}



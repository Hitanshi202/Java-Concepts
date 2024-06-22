public class Learnoops
{
}
class Demo
{
    void evenodd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is an even number");
        }
        else
        {
            System.out.println(num+" is an odd number");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        Demo sc = new Demo();
        sc.evenodd(15);
    }
}

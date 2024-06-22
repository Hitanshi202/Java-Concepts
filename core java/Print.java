public class Print
{}
class Practice1
{
    void run(int n)
    {
        if (n<101)
        {
            System.out.println(n);
            n++;
            new Practice1().run(n);
        }
    }
}
class Test6
{
    public static void main(String[] args)
    {
    new Practice1().run(1);
    }
}


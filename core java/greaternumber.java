public class greaternumber
{
    public static void main(String[] args)
    {
        int x = 5;
       int y = 33;
        int z = 6;
        if((x>y) && (x>z))
        {
            System.out.println(x+"is greater");
        }
else if((y>x) && (y>z))
        {
            System.out.println(y+ "is greater");
        }
else if((z>x) && (z>y))
        {
            System.out.println(z+"is greater");

        }
else
            System.out.println("invalid input");
    }
}

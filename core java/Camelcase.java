public class Camelcase
{//		Camel Case
    //		Java Development Kit
    public static void main(String[] args)
    {
        String s = "shivam is a java developer";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] == 32)
            {
                System.out.print(c[i]);
                i++;
                if (c[i] > 96 && c[i] < 123)
                {
                    System.out.print((char) (c[i] - 32));
                }
            } else if (i == 0)
            {
                if (c[i] > 96 && c[i] < 123)
                {
                    System.out.print((char) (c[i] - 32));
                }
            } else
            {
                System.out.print(c[i]);
            }
        }
    }
}

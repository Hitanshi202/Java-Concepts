public class Numberstar
{

    public static void main(String[] args)
    {
        int rows = 6;

        for (int i = rows; i > 0; i--) {
            for (int j = rows; j >= 1; j--)
            {
                if (j == i)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}


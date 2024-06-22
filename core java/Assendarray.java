public class Assendarray
{
    public static void main(String[] args)
    {
        int num[] = new int[]{2, 5, 3, 1, 23, 3, 67, 456, 2};
        int value = 0;
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i+1; j < num.length; j++)
            {
                if (num[i] > num[j])
                {
                    num[i] = num[j];
                    num[j] =value;
                }
                System.out.println(num[j]);
            }

            }
    }
}

public class Duplicatearray
{
    public static void main(String[] args)
    {
        int num[] = {2,5,3,1,23,3,67,456,2};
        for (int i= 0;i<num.length;i++)
        {
            for (int j =i+1;j<num.length;j++)
            {
                if(num[i]==num[j])
                {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
public class Smallestarray
{
    public static void main(String[] args)
    {
        int num[] = {2,5,3,1,23,3,67,456,2};
        int mim = num[0];
//    for (int i = 0; i<num.length;i++)j=i+1
        {
            for (int j = 0;j<num.length;j++)
            {
                if(num[j]<mim)
                {
                    mim = num[j];

                }

            }
            System.out.println(mim);
        }
    }
}


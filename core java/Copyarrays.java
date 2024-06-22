public class Copyarrays
{
    public static void main(String[] args)
    {
        int count = 0;

        int array1[] ={1,2,3,4,5,2,6,7,2,2,8,4,9};

        int array2[]=new int [array1.length];

        for(int i=0; i < array1.length; i++)
        {
            array2[i] = array1[i];
        }
        for(int k:array2)
        {
            if(k==2)
            {
                count ++;
            }
        }

        System.out.println(count);
    }
}

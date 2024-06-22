public class Arraysum
{
    public static void main(String[] args)

    {
                int  num []= new int [] {2,5,3,1,23,3,67,456,2};
                int sum = 0;

                for (int i = 0; i < num.length; i++)
//                    The length of an array is the number of elements that it can hold.
        {
                    sum = sum + num[i];
                }
                System.out.println( sum);



    }
}

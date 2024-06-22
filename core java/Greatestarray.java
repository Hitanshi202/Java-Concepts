public class Greatestarray
{
    public static void main(String[] args)
    {
    int num[] = {2,5,3,1,23,3,67,456,2};
    int max = num[0];
//    for (int i = 0; i<num.length;i++)j=i+1
     {
         for (int j = 1;j< num.length;j++)
         {
             if(num[j]>max)
             {
                max = num[j];

             }

         }
         System.out.println(max);
     }
    }
}

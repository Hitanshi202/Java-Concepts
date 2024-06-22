public class indiarray
{

        public static void main(String[] args)
        {
            int count = 0;

            int array1[] ={2,4,1,3,3,4,5,55,3,33,222,1,4,6,86,66,5,44};

            int array2[]=new int [array1.length];

            for(int i=0; i < array1.length; i++)
            {
                array2[i] = array1[i];
            }
            for(int k:array2)
            {
                if(k==2)
                {
                   count++;
                } else if (k==4)

                {
                    System.out.println();
                } else if (k==1)
                {
                  count++;
                }

            }

            System.out.println(count);

        }
    }



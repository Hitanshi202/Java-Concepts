public class Prime

    {
        public static void main(String[] args)
        {
            int num = 8;
            boolean check = true;
            for (int i = 2; i<num; i++)
            {
                if (num%i==0)
                {
                    check = false;
                }
                if (check == true)
                {
                    System.out.println("Prime number");
                }
                else
                {
                    System.out.println("not prime");
                }
            }

        }
    }



public class practise
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
            int count = 0;
            while (count < 3) {
                System.out.println("Count: " + count);
                count++;
                int num = 1;
                do {
                    System.out.println("Number: " + num);
                    num++;
                } while (num <= 3);

            }

        }

    }
}

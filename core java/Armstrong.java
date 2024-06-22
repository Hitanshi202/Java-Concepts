public class Armstrong
{
    public static void main(String[] args)
    {
        int num = 153;
//        nmber of digits
        int t1 = num;
        int digit = 0;
        while (t1>0)
        {
            t1/=10;
            digit++;
        }
//        mult & add
        int t2 = num;
        int sum = 0;
        while(t2>0)
        {
            int rem = t2%10;
            int mult =1;
            for(int i =1;i<=digit;i++)
            {
                mult =mult*rem;
            }
            sum+=mult;
            t2/=10;
        }
        if(num==sum)
        {
            System.out.println("its an armstrong number");
        }
        else
            System.out.println("Not an armstrong number");
    }
}

import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you current salary:");
        int salary=sc.nextInt();
        System.out.println("Year of Service:");
        int year= sc.nextInt();
        float percentage = 30;
        if(year>=5)
        {
            float bonus = percentage * salary/100;
            float total_salary = salary+bonus;
            System.out.println("thank you for working with us for  this period of time.");
            System.out.println("As gratitude ,you have a bonus of" + bonus + "on top of your salary");
            System.out.println("your total salary is :" + total_salary);
        }
        else
        {
            System.out.println("your salary is :" +salary);
        }

    }

}

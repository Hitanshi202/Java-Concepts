
import java.util.Scanner;

public class PlanetWeight
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth in kilogram: ");
        double weightOnEarth = scanner.nextDouble();


        System.out.print("Which planet do you want to see your weight on? ");
        String planet = scanner.next();

        switch (planet)
        {
            case "Mercury":
                weightOnEarth *= 0.38;
                break;
            case "Venus":
                weightOnEarth *= 0.91;
                break;
            case "Earth":
                break;
            case "Mars":
                weightOnEarth *= 0.38;
                break;
            case "Jupiter":
                weightOnEarth *= 2.34;
                break;
            case "Saturn":
                weightOnEarth *= 1.06;
                break;
            case "Uranus":
                weightOnEarth *= 0.92;
                break;
            case "Neptune":
                weightOnEarth *= 1.19;
                break;
            default:
                System.out.println("Invalid planet.");
                break;
        }

        // Display the weight on the desired planet
        System.out.println("Your weight on " + planet + " is " + weightOnEarth + " kilogram.");
    }
}


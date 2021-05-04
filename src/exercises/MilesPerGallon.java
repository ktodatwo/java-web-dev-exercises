package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How miles have you driven?");
        Double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas has the car consumed?");
        Double gallonsUsed = input.nextDouble();

        Double milesPerGallon = milesDriven/gallonsUsed;

        System.out.println("Your miles-per-gallon is :"+ milesPerGallon);
    }

}

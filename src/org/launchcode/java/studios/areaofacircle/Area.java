package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;
        Boolean isValid = false;

while (!isValid) {
    System.out.println("Enter a radius: ");

    if (input.hasNextDouble()) {
        radius = input.nextDouble();
        if (radius > 0) {
            Double circleArea = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + circleArea);
            isValid = true;
        } else {
            System.out.println("Not a positive, please try again");
        }

    } else {
        System.out.println("Not a valid number, please try again");
    }
    input.nextLine();
}

    } //end
}

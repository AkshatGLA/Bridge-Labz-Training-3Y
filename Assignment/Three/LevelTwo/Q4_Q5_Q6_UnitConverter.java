package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Create a UnitConvertor utility class to perform various unit conversions.
// All methods should be static.
class Q4_Q5_Q6_UnitConverter {

    // Question 4 Methods
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Question 5 Methods
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Question 6 Methods
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Example usage of one of the methods
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit to convert to Celsius: ");
        double fahrenheitValue = scanner.nextDouble();
        double celsiusResult = Q4_Q5_Q6_UnitConverter.convertFahrenheitToCelsius(fahrenheitValue);
        System.out.printf("%.2f Fahrenheit is %.2f Celsius.\n\n", fahrenheitValue, celsiusResult);

        System.out.print("Enter distance in Kilometers to convert to Miles: ");
        double kmValue = scanner.nextDouble();
        double milesResult = Q4_Q5_Q6_UnitConverter.convertKmToMiles(kmValue);
        System.out.printf("%.2f Kilometers is %.2f Miles.\n", kmValue, milesResult);

        scanner.close();
    }
}
package Assignment.Three.LevelTwo;

import java.util.Scanner;
import java.util.Arrays;

// Write a program Quadratic to find the roots of the equation ax^2 + bx + c. Use Math.pow() and Math.sqrt()
class Q11_QuadraticRootsFinder {

    public double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        double[] roots;

        if (delta > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            roots = new double[0];
        }
        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find the roots of ax^2 + bx + c = 0, please provide the coefficients.");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        Q11_QuadraticRootsFinder finder = new Q11_QuadraticRootsFinder();
        double[] equationRoots = finder.findRoots(a, b, c);

        if (equationRoots.length == 2) {
            System.out.println("There are two distinct real roots:");
            System.out.println("Root 1: " + equationRoots[0]);
            System.out.println("Root 2: " + equationRoots[1]);
        } else if (equationRoots.length == 1) {
            System.out.println("There is one real root:");
            System.out.println("Root: " + equationRoots[0]);
        } else {
            System.out.println("The equation has no real roots (delta is negative).");
        }
        scanner.close();
    }
}
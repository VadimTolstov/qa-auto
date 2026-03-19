package dz2;

public class MathOperations {

    public static void main(String[] arg) {
        System.out.println("add " + add(2, 3));
        System.out.println("subtract " + subtract(4, 3));
        System.out.println("multiply " + multiply(7, 3));
        System.out.println("divide " + divide(8, 3));
        System.out.println("findMax " + findMax(8, 3));
        System.out.println("difference " + difference(8, 10));
        System.out.println("squareArea " + squareArea(8));
        System.out.println("squarePerimeter " + squarePerimeter(8));
        System.out.println("convertSecondsToMinutes " + convertSecondsToMinutes(88));
        System.out.println("averageSpeed " + averageSpeed(88.12, 33.1));
        System.out.println("findHypotenuse 1  " + findHypotenuse(1.0, 0.0));
        System.out.println("findHypotenuse 2 " + findHypotenuse(77.8, 33.1));
        System.out.println("circleCircumference " + circleCircumference(1));
        System.out.println("calculatePercentage " + calculatePercentage(200, 25));
        System.out.println("celsiusToFahrenheit " + celsiusToFahrenheit(111.58));
        System.out.println("fahrenheitToCelsius " + fahrenheitToCelsius(120.57));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(int x, int y) {
        return (double) x / y;
    }

    static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return 4 * side;
    }

    static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

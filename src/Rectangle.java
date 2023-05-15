import java.util.Scanner;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void displayInfo() {
        double perimeter = calculatePerimeter();
        double area = calculateArea();
        double diagonal = calculateDiagonal();
        System.out.printf("Rectangle with side A: %.2f%nRectangle with side B: %.2f%nPerimeter: %.2f%nArea: " +
                "%.2f%nDiagonal: %.2f%n", sideA, sideB, perimeter, area, diagonal);
    }

    private double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    private double calculateArea() {
        return sideA * sideB;
    }

    private double calculateDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public static void main(String[] args) {
        double a = askSide("A");
        double b = Math.round((Math.random() * 10 + 1) * 100.0) / 100.0; // Generate a random number between 1 and 10, rounded to 2 decimal places
        Rectangle rectangle = new Rectangle(a, b);
        rectangle.displayInfo();
    }

    private static double askSide(String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert side A, side B will be random");
        System.out.print("Input side " + side + " (double): ");
        return scanner.nextDouble();
    }
}

import java.util.Scanner;

public class AreaCalculator {
    public static double calculateArea(double r) {
        return Math.PI * r * r;
    }
    public static double calculateArea(double l, double w) {
        return l * w;
    }
    public static double calArea(double b, double h) {
        return  (b * h ) /2 ;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double r = scanner.nextDouble();
                System.out.println("The area of the circle is: " + calculateArea(r));
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double l = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double w= scanner.nextDouble();
                System.out.println("The area of the rectangle is: " + calculateArea(l, w));
                break;

            case 3:
                System.out.print("Enter the base of the triangle: ");
                double b = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double h = scanner.nextDouble();
                System.out.println("The area of the triangle is: " + calArea(b, h));
                break;

            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class FunctionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        
        double result = calculateFunction(a, b, x);
        
        System.out.println("f(" + x + ") = " + result);
        
        scanner.close();
    }
    
    public static double calculateFunction(double a, double b, double x) {
        if (x >= 0 && x < 2) {
            return Math.sin(x);
        } else if (x == 2) {
            return 2 * Math.exp(a * x);
        } else if (x > 2 && x <= 8) {
            return 1 / (b * x + a);
        } else {
            System.out.println("Значення x поза допустимим діапазоном [0, 8].");
            return Double.NaN;
        }
    }
}

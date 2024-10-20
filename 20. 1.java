public class Main {
    public static void main(String[] args) {
        double delta = 0.8;
        double a = 3;
        double b = 1.5;
        double alpha = 0.394;

        double x = delta * Math.exp(Math.pow(b, 2)) * Math.sin(alpha);

        double y = Math.sqrt(b * Math.pow(Math.cos(a), 2) + a);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

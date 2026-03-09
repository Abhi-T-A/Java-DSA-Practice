// import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a,b,c");
        // double a = sc.nextInt();
        // double b = sc.nextInt();
        // double c = sc.nextInt();
        double a = 1, b = -3, c = 2;

        double D = b * b - 4 * a * c;

        if (D > 0)

        {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are: x1= " + x1 + " and x2= " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Both roots are equal:" + x);
        } else {
            System.out.println("Roots are cpmplex");
        }
    }
}
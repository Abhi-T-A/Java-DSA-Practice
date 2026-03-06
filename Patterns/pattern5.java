import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {

            for (int j = 0; j <= count - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
            System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
            System.out.print("*");
            }
            System.out.println();
            }
            for (int i = 0; i <= count; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.print(" ");
            }
            for (int j = 1; j <= count-i-1; j++) {
            System.out.print("*");
            }
            for (int j = 1; j <=count- i-2; j++) {
            System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}

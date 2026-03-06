import java.util.*;
public class ReverseRightHalfPyramid {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <=count-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }

    }
}


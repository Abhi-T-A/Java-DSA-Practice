import java.util.*;

//Right half Pyramid

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}


//Reverse Right half Pyramid

// public class Pattern4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         for (int i = 1; i <= count; i++) {
//             for (int j = 1; j <=count - i + 1; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//             sc.close();
//         }
//     }
// }
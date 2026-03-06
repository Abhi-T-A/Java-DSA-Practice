import java.util.*;

// logic 1

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = count; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}


//logic 2

// public class pattern2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         for (int i = 1; i <= count; i++) {
//             for (int j = 1; j <= count - i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             sc.close();
//         }
//     }
// }


// logic 3
// public class pattern2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int count=sc.nextInt();
//         for(int i=0;i<count;i++){
//             for(int j=1;j<=count-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//             sc.close();
//         }

//     }
// }

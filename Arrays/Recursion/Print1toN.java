package Recursion;

// import java.util.*;

public class Print1toN {

    static void printNumbers(int n){

        if(n == 0){
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args){
        printNumbers(5);
    }
}

// public class Print1toN {

//     static void printNumbers(int n) {

//         if (n == 0) {
//             return;
//         }

//         printNumbers(n - 1);
//         System.out.println(n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         sc.close();
//         printNumbers(num);

//     }
// }

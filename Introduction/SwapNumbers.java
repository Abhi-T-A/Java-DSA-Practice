// public class Swap {
//     public static void main(String[] args) {
//         int a, b;
//         a = 50; b = 100;
//         System.out.println("Before swapping:" + a + " " + b);
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("After swappingL:" + a + " " + b);
//     }
// }



// without using temp
import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
}

// Logic (step by step)
// Assume input: a = 10, b = 20

// a = a + b;
// a = 30, b = 20

// b = a - b;
// b = 30 - 20 = 10 (old value of a)

// a = a - b;
// a = 30 - 10 = 20 (old value of b)

// Now swapped: a = 20, b = 10.

// program flow
// Take input for a and b
// Print before swap
// Apply 3 swap lines
// Print after swap
// Close scanner
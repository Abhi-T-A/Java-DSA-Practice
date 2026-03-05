import java.util.Scanner;

public class FactorialRecursion {
    static long factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }

        sc.close();
    }
}

// Logic:

// Base case: 0! and 1! are 1.
// Recursive case: n! = n * (n-1)!
// Keep calling until it reaches base case.
// Time complexity: O(n)
// Space complexity: O(n) (recursion stack)



// public class FactorialRecursion {
//     static long factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1; // base case
//         }
//         return n * factorial(n - 1); // recursive case
//     }

//     public static void main(String[] args) {
//         int n = 5; // fixed value (no user input)
//         System.out.println("Factorial of " + n + " = " + factorial(n));
//     }
// }

import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}

//Logic:

// Numbers <= 1 are not prime.
// Check divisibility from 2 to sqrt(n) using i * i <= n.
// If any divisor is found, not prime.
// Else prime.
// Time complexity: O(sqrt(n))
// Space complexity: O(1)




// public class PrimeCheck {
//     public static void main(String[] args) {
//         int n = 29; // fixed number (no user input)

//         boolean isPrime = true;

//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i<=n/2; i++) {    // for(int i=2;i*i<=n)
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(n + " is Prime");
//         } else {
//             System.out.println(n + " is Not Prime");
//         }
//     }
// }


// Logic:

// Numbers <= 1 are not prime.
// Check divisibility from 2 to sqrt(n) using i * i <= n.
// If any divisor is found, not prime.
// Else prime.
// Time complexity: O(sqrt(n))
// Space complexity: O(1)
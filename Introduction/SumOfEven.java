//write a program to print the sum of all even numbers from 1 t 100

public class SumOfEven {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){    //even sum
                sum +=i;
            }
        }
         System.out.println("SUM="+sum);
    }
    
}
// Step by step
// int sum = 0;
// Start with total as 0.

// for (int i = 1; i <= 100; i++)
// Loop runs from i = 1 to i = 100.

// if (i % 2 == 0)
// Checks if i is even.
// (% gives remainder, so even numbers have remainder 0 when divided by 2.)

// sum += i;
// Add that even number to sum.

// System.out.println("SUM=" + sum);
// In your code, this is inside the loop, so it prints 100 times (after every i).

// Important note
// If you want only the final answer, move println outside the loop.
// Final sum of even numbers from 1 to 100 is: 2550.




//write a program to print the sum of all odd numbers from 1 t 100
// public class SumOfodd {
//     public static void main(String[] args) {
//         int sum = 0;

//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 != 0) {   // odd check
//                 sum += i;
//             }
//         }
//         System.out.println("SUM = " + sum);
//     }
// }


// Logic:

// Start sum = 0
// Loop i from 1 to 100
// i % 2 != 0 means odd number
// Add odd numbers to sum
// Print final result once
// For 1 to 100, odd sum is 2500.
package Basic;

public class LargestNumber {

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 9, 7, 4};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        System.out.println("Largest number is: " + largest);
    }
}
package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]={10,12,31,14,54,16,75,18,95,110};
    int key=sc.nextInt();
   
    for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            System.out.println("Found at index: " + i);
            sc.close();
            return;
        }
    }
    System.out.println("Not found");
    sc.close();
    }
    
}

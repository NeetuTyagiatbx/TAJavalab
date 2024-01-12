package arrbasics.src.Jan6Opps;

import java.util.Scanner;

public class userInputAsArray {
    public static void main(String[] args) {
        System.out.println("Enetr how many elements you want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array of length 10 in memory
        int arr1[] = new int[10];
         //taking array from user
        System.out.println("Enetr the elements");
        for (int i=0 ; i<n ; i++)
            arr1[i] =sc.nextInt();
        System.out.println("Array elements are :");

        for (int i=0 ; i<n ; i++)
            System.out.println(arr1[i]);
        sc.close();


    }
}

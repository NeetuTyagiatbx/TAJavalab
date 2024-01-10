package arrbasics.CodingProblems30Dec;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till Series will be printed");
        int userIn = sc.nextInt();
        int n1 = 0, n2 = 1, n3 ,j;
       // System.out.print("1" + "\t" + " \t" + "2");

        for(j =2 ; j <=userIn ; j++){

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

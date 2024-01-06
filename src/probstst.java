package src;

import java.util.Scanner;


public class probstst {

    public static void main(String[] args) {

        //take 3 vars from user and calculate x2 + y2 - |z|

        System.out.println("Enter 3 input values ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = a*a;
        int y  = b*b;
        int z = Math.abs(c);

        System.out.println("a power 2 is : " +x);
        System.out.println("b power 2 is : " +y);
        System.out.println("abs value od c is : " +z);

        int result1 = x+y-z ;
        System.out.println(result1 );
       // System.out.println(result1 ^(1/2));



    }



}

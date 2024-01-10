package arrbasics.CodingProblems30Dec;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or Number");
        String orgString = sc.nextLine();
        int sl = orgString.length();
        String rev = "";
        for (int i = sl - 1 ; i>=0 ; i--){
            // chatat starts from 0
             rev = rev + orgString.charAt(i);
        }
        System.out.println("Reverse String/Num is :  " + rev);
        //Compare the string content
        if (orgString.equalsIgnoreCase(rev))
            System.out.println("String/Number is Palindrome");
        else
            System.out.println("String/Number is not Palindrome");

    }
}

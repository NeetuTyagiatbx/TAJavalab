package arrbasics.src.Jan6Opps;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        String rev = "";
        System.out.println("Enter a String to check palindrome");
        Scanner sc = new Scanner(System.in);
        String orgsrt = sc.nextLine();

        int strLen = orgsrt.length();

        for(int i = strLen -1 ; i>=0 ; i--)
        {

            rev = rev + orgsrt.charAt(i);
        }
        System.out.println("Reverse of the string is " +rev);

        if (orgsrt.equalsIgnoreCase(rev)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }

    }
}

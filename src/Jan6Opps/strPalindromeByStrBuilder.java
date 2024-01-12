package arrbasics.src.Jan6Opps;

import java.util.Scanner;

public class strPalindromeByStrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String strinput = sc.next();
        boolean result = isPalindrome(strinput);
        if (result)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }

    private static boolean isPalindrome(String userInput) {
        String originalString = userInput ;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return originalString.equalsIgnoreCase(sb.toString());
    }
}

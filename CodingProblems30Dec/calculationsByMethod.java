package arrbasics.CodingProblems30Dec;

import java.util.Scanner;

public class calculationsByMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 1");
        int num2 = sc.nextInt();

        System.out.println(sum(num1 ,num2));

        }
      // fun definition should be outside of main
    static int sum(int n1 , int n2){
        return n1+n2;
        // return should be the last statement
    }
}

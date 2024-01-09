package arrbasics.CodingProblems30Dec;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int flag = 0;
        for(int i =2 ; i<num/2 ; i++){
            if (num % i ==0){
                System.out.println("It is not a Prime Number");
                flag=1;
                break;
            }

        }
        if(flag ==0){
            System.out.println("Prime Number");
        }
    }
}

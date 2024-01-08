package arrbasics.BasicsArr;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        //leap year divisible by 4 but not by 100 unless it is divisible by 400
        // but not by 100 unless it is divisible by 400 -- OR statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int UserInputYear = sc.nextInt();

        sc.close();

        if((UserInputYear % 4 ==0 && UserInputYear % 100 ==0) || UserInputYear % 400 == 0){
            System.out.println("Entered Year is a LeapYear  " +UserInputYear);
        }
        else
            System.out.println("Entered year is not a Leapyear  "  +UserInputYear);

    }
}

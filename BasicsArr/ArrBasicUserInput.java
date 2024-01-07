package BasicsArr;

import java.util.Scanner;

public class ArrBasicUserInput {
    public static void main(String[] args) {
        //take 5 sub mrks from User
        Scanner sc = new Scanner(System.in);
        float[] marks=new float[5];
        System.out.println("Enter 5 sub marks");
        //marks[0]=sc.nextFloat();
        for(int i=0 ; i<marks.length ; i++) {
            System.out.println("Enter marks of " + i);
            marks[i] = sc.nextFloat();

        }
        sc.close();
        System.out.println("Print the marks ");
        for(int i=0 ; i<marks.length ; i++)
            System.out.println(marks[i]);


    }
}

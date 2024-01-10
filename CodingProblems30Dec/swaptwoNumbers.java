package arrbasics.CodingProblems30Dec;

public class swaptwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        // by Addition
        num1 = num2 +num1 ;
        num2 = num1 - num2 ;
        num1 = num1 -num2 ;
        System.out.println("Swaaped value of num2 is : " + num2);
        System.out.println("\"Swaaped value of num1 is : \"" + num1);

        // By multiplication
        int num3 = 4;
        int num4 = 5;
        // by Addition
        num3 = num4 * num3 ;
        num4 = num3 / num4 ;
        num3 = num3 / num4 ;
        System.out.println("Swaaped value of num2 is : " + num4);
        System.out.println("\"Swaaped value of num1 is : \"" + num3);

    }
}

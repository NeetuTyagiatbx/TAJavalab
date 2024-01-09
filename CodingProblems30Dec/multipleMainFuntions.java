package arrbasics.CodingProblems30Dec;

public class multipleMainFuntions {
    public static void main(String[] args) {
        System.out.println("Main function ,Starting point of program");
        System.out.println(main());
        System.out.println(main(4.5));

    }
    public static boolean main(){
        System.out.println("Another main function with type int");

        return true;
    }
    public static double main(double a){
        System.out.println("Another main function with different type of args");
        return 6.7;
    }
}

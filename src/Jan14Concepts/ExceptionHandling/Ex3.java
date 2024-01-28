package arrbasics.src.Jan14Concepts.ExceptionHandling;

public class Ex3 {
    public static void main(String[] args) {
        // unchecked exception
        // check the line where to see the issue Line no 7
     extracted2();
    }

    private static void extracted2(){
        extracted1();
        System.out.println("Will not execute ");
    }

    private static void extracted1(){
        extracted();
    }

    private static void extracted(){
        String name = null;
        name.length();
    }

}


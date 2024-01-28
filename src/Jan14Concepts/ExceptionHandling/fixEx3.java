package arrbasics.src.Jan14Concepts.ExceptionHandling;

public class fixEx3 {
    public static void main(String[] args) {
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
        try {
            String name = null;
            name.length();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

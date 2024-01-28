package arrbasics.src.Jan14Concepts.ExceptionHandling;

public class Ex1 {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();
            System.out.println("Exception");
        }catch (Exception e){
            System.out.println(" Java does not allow to trim a null string");
        }

    }
}

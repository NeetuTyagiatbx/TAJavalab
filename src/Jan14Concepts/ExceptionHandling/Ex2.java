package arrbasics.src.Jan14Concepts.ExceptionHandling;

public class Ex2 {
    public static void main(String[] args) {
        try{
            int a =0;
            int x = 10/a;

        }catch (Exception e){
            System.out.println("Exit");
            System.exit(0);
        }finally {
            System.out.println("I am final");
        }
    }
}

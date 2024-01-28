package arrbasics.src.Jan14Concepts.WrapperClassPart1;

public class Ex1 {
    public static void main(String[] args) {
        // collection framework work only on Wrapper class
        int a=10;
        // String st = a;  not possible

        Integer i = Integer.valueOf(a);
        System.out.println(i);

        Integer j = a;
        System.out.println(j);

        String s = String.valueOf(a);
        System.out.println(a);
    }
}

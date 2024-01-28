package arrbasics.src.Jan14Concepts;

public class Ex2Interface {
    public static void main(String[] args) {
        System.out.println(H.a);
    }
}

interface H{
    //public static final variables by default
    int a =10;
    int b= 20;
    // method is not static
    void m1();

}

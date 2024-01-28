package arrbasics.src.Jan14Concepts;

public class Ex1 {
    public static void main(String[] args) {
       // calling static
        P01.m2();
        System.out.println(P01.b);

        P01 p01 = new P01();
        P01 p02 = new P01();

        // calling non static
        p01.m1();
        // static can be called with null reference also
        P01 p03 = null;
        System.out.println("Static call with null reference but instance cannot be called with null reference");
        p03.m2();

    }
}

class P01{
    static {
        System.out.println("SIB");
    }

    //IIB
    {
        System.out.println("IIB");
    }

    int a=10;
    static int b = 20;
    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2(){
        System.out.println("Inside static method " +b);
    }
}
package arrbasics.src.Jan14Concepts;

public class EX3 {
    public static void main(String[] args) {
        System.out.println(PP.a);
        PP p = new foo();
        rofl r = new foo();
        p.m();
        r.say();
    }
}
interface PP{
    int a =10;
    void m();
}
abstract class rofl implements PP{
    // can have completed method also and abstract also
    abstract void say();
}

class foo extends rofl{

    @Override
    public void m() {
        System.out.println("Method m in concrete class");
    }

    @Override
    void say() {
        System.out.println("Method say in concrete class");
    }
}
package arrbasics.src.Jan13Concepts.polymorphism;

public class pract1 {
    int a;
    void run(){
        System.out.println("Run is Called");
    }

    public static void main(String[] args) {
        pract1 p = new pract1();
        p.run();
        // error as obj is not created
       // pract1 p2 =null;
        // p2.run();
    }
}

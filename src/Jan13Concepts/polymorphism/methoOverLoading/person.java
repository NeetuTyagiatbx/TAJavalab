package arrbasics.src.Jan13Concepts.polymorphism.methoOverLoading;

public class person {
    int a;
    boolean b;

    person(){
        this.a = 10;
    }
    person(int b){
        this.a = b;
        System.out.println(b);
    }
    person(int b , boolean a){
        this.a =b;
        this.b = a;
    }
}

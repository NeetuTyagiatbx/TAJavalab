package arrbasics.src.Jan13Concepts.polymorphism.methoOverLoading;

public class personMain {
    public static void main(String[] args) {
        person h= new person();
        // 10 , false
        System.out.println(h.a);
        System.out.println(h.b);

        person h2 = new person(30);
        person h3 = new person(40,true);
        // print class var value , provided in refrence
        System.out.println(h3.b);
        System.out.println(h3.a);
    }
}

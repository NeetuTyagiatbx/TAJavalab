package arrbasics.src.Jan13Concepts.polymorphism.methoOverLoading;

public class Additionmain {
    public static void main(String[] args) {
        Addition a = new Addition();

        System.out.println(a.add(10,30));
        System.out.println(a.add(10,20,30));
        System.out.println(a.add(10,10.5f , 10));


    }
}

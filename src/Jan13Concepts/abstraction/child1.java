package arrbasics.src.Jan13Concepts.abstraction;

public class child1 extends fatherClass{

    @Override
    void CrLoan5() {
        System.out.println("Pay the loan to have 3BHK from father");
    }

    @Override
    void bhk3() {
        super.bhk3();
    }

    public static void main(String[] args) {
        child1 c= new child1();
        c.bhk3();
        c.CrLoan5();
    }
}

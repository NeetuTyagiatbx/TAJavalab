package arrbasics.src.Jan13Concepts.polymorphism.methoOverRiding;

public class methodOverriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding example");
        // run time polymorphism
        bank par = new HDFC_Bank();
        //par.getRateofIntrest();
        int r = par.getRateofIntrest();
        System.out.println(r);
        bank b = new bank();
        System.out.println(b.getRateofIntrest());
        IDFC_Bank i = new IDFC_Bank();
        System.out.println(i.getRateofIntrest());
        SBI_Bank s = new SBI_Bank();
        System.out.println(s.getRateofIntrest());

    }
}

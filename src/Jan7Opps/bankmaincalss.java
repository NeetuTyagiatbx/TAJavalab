package arrbasics.src.Jan7Opps;

public class bankmaincalss {
    public static void main(String[] args) {
        bankAccount b1 = new bankAccount("SBI" ,1000);
        bankAccount b2 = new bankAccount("HDFC" , 2000);
        b1.printdetails();
        System.out.println("----------------------------------");
        b2.printdetails();

    }
}

package arrbasics.src.Jan7Opps;

public class bankAccount {
    String bankName ;
    int balance;
    void printdetails(){
        System.out.println("bank Name is " +bankName);
        System.out.println("Balance is " +balance);
        System.out.println("Values from parametrized Constructor");
    }

    bankAccount(String BnamefromObjeRef , int balfromObjeRef){
        this.balance = balfromObjeRef;
        this.bankName = BnamefromObjeRef;
    }
}

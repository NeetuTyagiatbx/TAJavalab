package arrbasics.src.Jan7Opps.inheritance.prog2;

public class singleInhMain {
    public static void main(String[] args) {
        singleInhChild c1 = new singleInhChild();
        c1.printChilddetails();
        c1.printParentDetails("Harsh" , 35);
        singleInherParent pRef = new singleInhChild();
        pRef.houseDetails();
        System.out.println("Calling from parent ref from child object , only parent methods available to call");
        System.out.println(" ");
        pRef.houseDetails();
       // singleInhChild c2 = new singleInherParent();
       // child ref cannot be created from parent object
    }
}

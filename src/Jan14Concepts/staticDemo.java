package arrbasics.src.Jan14Concepts;

public class staticDemo {
    // static variable
    public static String collageName= "TTA";

    // instance variable
    String name = "Neetu";
    //static method
    public static boolean printDeatils(){
        // local var
        int phone = 729;
        System.out.println("Print ststic var value Collage Name -> " +collageName);
        System.out.println("Last 3 digit of phone number is ->" +phone);
        return true;
    }

    void method_nonstatic(){
        System.out.println("both static and instance va cab be accessed here ->" +name);
        System.out.println("Collage name is -> " +collageName);
    }
    public static void printDeatils1(){
        // local var
        int phone = 729;
        System.out.println("Print ststic var value Collage Name -> " +collageName);
        System.out.println("Last 3 digit of phone number is ->" +phone);

    }

}

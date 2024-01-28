package arrbasics.src.Jan14Concepts.innerClass;

public class lab152 {
    public static void main(String[] args) {
        car c = new car("Creta");
        c.drive();
        // creating inner class ref
        // OC.IC ref = OCref.new IC()
        car.engine e = c.new engine();

        e.inner_engine();
        // inner class cannot be accessed without OC
    }

}
class car{
    String makemodel;
    // param constructor
   public car(String makeyrObjRef){
        this.makemodel = makeyrObjRef;
    }

    void drive(){
        System.out.println("I Can drive a Car");
    }

    public class engine{
       void inner_engine(){
           int hp = 400;
           System.out.println("Inner class inside the class ,can access OC var");
           System.out.println("Calling from IC , Model is -> " +makemodel);
           System.out.println("Horse Power is IC -> " +hp);
       }
    }
}
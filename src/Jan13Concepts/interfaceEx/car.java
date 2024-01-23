package arrbasics.src.Jan13Concepts.interfaceEx;

public class car implements Engine,Break{

    // hiding engine and break calling it in class method
    void callingTheclassMethod(){
        engine();
        startbreak();

    }
    @Override
    public void engine() {
        System.out.println("Engine Started / Hiding the Engine process details ");
    }


    @Override
    public void startbreak() {
        System.out.println("Start Break /Hiding the process ");
    }

    public static void main(String[] args) {
       car c = new car();
       c.callingTheclassMethod();
    }
}

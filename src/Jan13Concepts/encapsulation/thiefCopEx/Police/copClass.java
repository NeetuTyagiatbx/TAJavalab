package arrbasics.src.Jan13Concepts.encapsulation.thiefCopEx.Police;

public class copClass {
    public int gun;
    public copClass(int objrefgun){
        this.gun = objrefgun;
        System.out.println("I have " +gun  + " guns");
    }
    protected void canIshoot(){
        System.out.println("Yes , you can shoot");
    }



}

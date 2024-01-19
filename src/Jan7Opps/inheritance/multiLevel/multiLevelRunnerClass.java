package arrbasics.src.Jan7Opps.inheritance.multiLevel;

public class multiLevelRunnerClass {
    public static void main(String[] args) {

        son_class s =null;
      //  s.sonHouse();   cannot invoke as son is null
        son_class s1 =new son_class();
        s1.gp_House();
        s1.parentHouse();
        s1.sonHouse();



    }
}

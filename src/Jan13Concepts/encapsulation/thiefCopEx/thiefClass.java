package arrbasics.src.Jan13Concepts.encapsulation.thiefCopEx;

import arrbasics.src.Jan13Concepts.encapsulation.thiefCopEx.Police.copClass;

public class thiefClass {
    public static void main(String[] args) {
        copClass c = new copClass(10);
       // c.canIshoot();
        System.out.println(c.gun);
        // make method private so that thief cannot access it
        // make method protected so that Jr cop within same folder can access it



    }
}

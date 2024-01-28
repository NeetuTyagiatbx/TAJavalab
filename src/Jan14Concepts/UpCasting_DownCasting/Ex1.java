package arrbasics.src.Jan14Concepts.UpCasting_DownCasting;

public class Ex1 {
    public static void main(String[] args) {
        //one type of object (i.e.) child or parent to another
        // upcasting -> child object to a parent object.
        // downcasting -> parent object to a child object
        // Upcasting
        parent p = new child();
        p.parnetName = "Neetu";
        System.out.println(p.parnetName);
        p.method();

        System.out.println("Downcasting");
        //downcasting
        // Child c = new Parent();   not possible
        child c = (child)p;
        c.childName = "Harshika";
        System.out.println(c.childName);
        c.method();
        c.childName = p.parnetName;
        System.out.println(c.childName);
        p.parnetName = c.childName;
        System.out.println(p.parnetName);


    }
}
class parent{
    String parnetName;
    void method(){
        System.out.println("I am parent method");
    }
}
class child extends parent{
    String childName;
    @Override
    void method() {
        System.out.println("I am child method");
    }
}
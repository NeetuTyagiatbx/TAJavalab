package arrbasics.src.Jan7Opps.inheritance.prog2;

public class singleInherParent {
    String name;
    int age;

    void printParentDetails(String n , int a){
       // System.out.println("Name of parent is " +name);     o/p null
        // System.out.println("Age of parent is  " +age);     o/p 0

        this.name = n;
        this.age = a;
        System.out.println("Name of parent is " +name);
        System.out.println("Age of parent is  " +age);

    }

    void houseDetails(){
        System.out.println("3 BHK of Parent");
    }

}

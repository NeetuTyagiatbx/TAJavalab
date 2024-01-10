package arrbasics.CodingProblems30Dec;

public class defaultConstructor1 {

    defaultConstructor1(){
        System.out.println("default constructor called");
    }

    void show(){
        System.out.println("Class method called here");
    }

    public static void main(String[] args) {
        //will create class obj here and call the method
        defaultConstructor1 obj1 = new defaultConstructor1();
        obj1.show();
    }
}

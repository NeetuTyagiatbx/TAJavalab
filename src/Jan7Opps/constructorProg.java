package arrbasics.src.Jan7Opps;

public class constructorProg {
    // instance varible
    String name;
    long salary;
    String email;

    constructorProg(){
        System.out.println("I am DC of Constructor prog");
    }
    constructorProg(String valuefrmObjRef){
        this.name = valuefrmObjRef;
        System.out.println("I am parametrized constructor , taking value from Object refrence ");
    }
}

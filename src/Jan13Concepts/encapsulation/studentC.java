package arrbasics.src.Jan13Concepts.encapsulation;

public class studentC {
    // Data Members
    int id;
    String name;
    // methods return , no return
    void sleep(){
        System.out.println("Sleep method of call ");
    }
    int sum (int a, int b){
        System.out.println("Method returns sum");
        return a + b;
    }

    void printid(int id){

        this.id = id;
        System.out.println("ID is " +id);
    }

}

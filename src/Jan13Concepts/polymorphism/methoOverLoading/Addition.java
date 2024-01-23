package arrbasics.src.Jan13Concepts.polymorphism.methoOverLoading;

public class Addition {
    int add(int a , int b){

        System.out.println("Addition of two integer is " );
        return a +b;
    }

    int add(int a ,int b , int c){
        System.out.println("Addition of three interger is");
        return a+b+c;
    }
    float add(int a , float b , int c){
        System.out.println("Addition of three interger is");
        return a+b+c;
    }
}

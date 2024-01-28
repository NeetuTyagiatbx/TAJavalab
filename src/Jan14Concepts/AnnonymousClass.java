package arrbasics.src.Jan14Concepts;

public class AnnonymousClass {
    public static void main(String[] args) {
        Student s = new Student() {
            @Override
            public void setId() {
                System.out.println("Anonymous class");
            }
        };

        s.setId();  // similarly abstract class can be implemented with anonymous class
    }
}
abstract class B{
    int b= 10;
}
interface Student{
    int id = 11;
    void setId();
}
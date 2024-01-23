package arrbasics.src.Jan13Concepts.encapsulation;

public class studentrunner {
    public static void main(String[] args) {
        studentC c1 = new studentC();
        // not a good practice , anyone can change the value
        c1.printid(10);

    }
}

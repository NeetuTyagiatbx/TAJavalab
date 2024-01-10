package arrbasics.CodingProblems30Dec;

public class comparetwoObjs {
    public static void main(String[] args) {
        // equals() comapre two objects
        comparetwoObjs ref1 = new comparetwoObjs();
        comparetwoObjs ref2 = new comparetwoObjs();
        System.out.println(ref1);
        System.out.println(ref2);

        if (ref1.equals(ref2))
            System.out.println("both objects are equal");
        else
            System.out.println("Both Objects are not equal");


    }
}

package arrbasics.src.Jan6Opps;

public class stringProg {
    public static void main(String[] args) {
        String name1 = "Neetu";
        String nam= "Tyagi";
        System.out.println(name1);
        String name2 = new String("Tyagi");
        String name3 = name1.concat(name2);

        String name4 ="NeetuTyagi";

        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4.equals(name3));
        System.out.println(" ");
        System.out.println(name2.equals(nam));
        name1 = nam.concat(name4);
        System.out.println("Concatinated value of name1 is " +name1);
        String checkimmutability = "Neetu";

        // memory efficient
        if (name1 == checkimmutability)
            System.out.println("Referring to same String in JVM");
        else
            System.out.println("Not referring to same String in JVM");

    }
}

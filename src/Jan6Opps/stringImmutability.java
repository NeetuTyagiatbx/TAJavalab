package arrbasics.src.Jan6Opps;

public class stringImmutability {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat(str1);
        System.out.println(str1);
        System.out.println(str1.concat(str1));
        //String ref to same ref
        String str2 ="Hello";
        System.out.println(str1.concat(str2));

        if (str1 == str2)
            System.out.println("Memory efficient , both refering to same ref in memory");
        else
            System.out.println("Not Memory efficient , both not refering to same ref in memory");

        System.out.println("contains function : " +str1.contains("l"));

        //creating diffrent ref in JVM and compare
        String str3 = new String("Hello");
        if (str1==str3)
            System.out.println("Same loc");
        else
            System.out.println("Diffrent locations , one is in scp and other is in Object are");

        String str4 = new String("Hello");

        if (str3 == str4)
            System.out.println("Same loc both are in Object are");
        else
            System.out.println("Diffrent locations , diffrent refrence in  Object area");

    }
}

package arrbasics.src.Jan14Concepts;

public class staticDemo_main {
    public static void main(String[] args) {
        // static var,method cab be called directly with class name , without creating Object
        System.out.println(staticDemo.collageName);
        System.out.println(staticDemo.printDeatils());

        //static method not returning

        staticDemo.printDeatils1();

        // create obj to call non static method

        staticDemo s1 = new staticDemo();
        s1.method_nonstatic();
        // static/instance value can be changed
        staticDemo.collageName = "Java Learning";
        staticDemo.printDeatils1();

    }



}

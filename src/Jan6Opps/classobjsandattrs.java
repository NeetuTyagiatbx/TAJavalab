package arrbasics.src.Jan6Opps;

public class classobjsandattrs {
    public static void main(String[] args) {
        defineclassAndObjs p = new defineclassAndObjs();
        p.name ="Neetu Tyagi";
        p.name = "Harsh Tyagi";
        System.out.println(p.name);
        p.msg();
        defineclassAndObjs p1 =new defineclassAndObjs(40 );
       // Obj without refrence
        new defineclassAndObjs();
        // not an Object
        defineclassAndObjs p2 = null;

        dogClass d = new dogClass();

    }
}

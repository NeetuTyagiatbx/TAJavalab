package arrbasics.src.Jan14Concepts.staticInnerClass;

public class lab153 {
    public static void main(String[] args) {
        OOC.SNIC icRef = new OOC.SNIC();
        icRef.show();
    }
}

class OOC{
     static int s =10;
     int b = 30;

     static class SNIC{
         void show(){
             System.out.println("Only static var access  -> " +s);
         }
     }
}

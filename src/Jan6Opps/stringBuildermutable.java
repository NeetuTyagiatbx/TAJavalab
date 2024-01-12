package arrbasics.src.Jan6Opps;

public class stringBuildermutable {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Neetu");
        sb1.append("Neetu");
        System.out.println("Changed value of string is " +sb1);

        // Sb1 as Neetu is deleted now , New value is assigned to sb1 NeetuNeetu

        // immutable way
        String str2 = new String("Tyagi");
        str2.concat("Tyagi");
        System.out.println("Immutable String , Value is : " +str2);

        //mutable atring bu stringbuffer
        StringBuffer sbuf = new StringBuffer("Harsh");
        sbuf.append("Man");
        System.out.println("Updated value by StringBuffer is " +sbuf);

    }
}


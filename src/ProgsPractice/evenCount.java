package arrbasics.src.ProgsPractice;

public class evenCount {
    public static void main(String[] args) {
        evenCount e = new evenCount();
        int count = e.evencount(3,-3,4,6);
        System.out.println(count);

    }
    int evencount(int a, int b, int c,int d){
        int cnt =0;

        if ( a < 0)
            a = (-1) * a;
        if ( b <0)
            b = (-1) * b;
        if ( c <0)
            c = (-1) * c;
        if ( d <0)
            d = (-1) * d;
        if (a%2 ==0)
            cnt++ ;
        if (b%2 ==0)
            cnt++ ;
        if (c%2 ==0)
            cnt++ ;
        if (d%2 ==0)
            cnt++ ;
        return cnt;


    }
}

package arrbasics.src.ProgsPractice;

public class ExactMultiple {
    public static void main(String[] args) {
        ExactMultiple e1 = new ExactMultiple();
        int res = e1.multiple(10,2);
        System.out.println(res);

    }

    public int multiple(int n , int m){
        int val =0;


        if (n<0 || m<0)
            val =3;
        else if ((n%m)!= 0)
            val = 1;
        else val = 2;

        return val;
    }

}

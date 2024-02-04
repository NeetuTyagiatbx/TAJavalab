package arrbasics.src.ProgsPractice;

public class isEven {
    public static void main(String[] args) {

        isEven c2 = new isEven();
        int res =  c2.logic(21);
        System.out.println("NUmber is even  -> " +res);

    }
    public int logic (int input) {
        if (input % 2 == 0) return 0;
        else
            return 1;

    }
}

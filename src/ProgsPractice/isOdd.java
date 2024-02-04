package arrbasics.src.ProgsPractice;

public class isOdd {
    public static void main(String[] args) {

        isOdd c1 = new isOdd();
       boolean res =  c1.logic(20);
        System.out.println("NUmber is Odd  -> " +res);


    }
    public boolean logic (int input) {
        if (input % 2 != 0) return true;
        else
            return false;

    }

}

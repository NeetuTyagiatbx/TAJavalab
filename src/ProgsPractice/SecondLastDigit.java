package arrbasics.src.ProgsPractice;

public class SecondLastDigit {
    public static void main(String[] args) {
       // int num = 1890;
        //int num2 = 19087;

     //   System.out.println(number1);

        //int second = Character.getNumericValue((number1.charAt(number1.length() -2))) ;
        //System.out.println(second);
        SecondLastDigit obj1 = new SecondLastDigit();
        //int digit = obj1.secondDigit(-678);
        int digit = obj1.secondDigit(56789);
        System.out.println(digit);

    }

    public int secondDigit(int input) {

        if (input < 0)
            input = (-1)*input ;

        String number1 = Integer.toString(input);
        //System.out.println(number1);
        int second = Character.getNumericValue((number1.charAt(number1.length() -2))) ;
        return second;

    }
}

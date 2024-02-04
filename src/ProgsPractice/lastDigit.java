package arrbasics.src.ProgsPractice;

public class lastDigit {
    public static void main(String[] args) {

        int res1 = lastDigitfun(677);
        System.out.println(res1);
    }
    public static int lastDigitfun(int input){
        if (input<0) return input=(-1)*input;
        else
            return input%10;
    }

    public static class pIndexOf {
        public static void main(String[] args) {
            int num;
            String mystr = "TutorialLearning";
            //System.out.println(mystr.indexOf("Tut"));
            num =mystr.indexOf("Tut");
            System.out.println(num);

        }
    }
}

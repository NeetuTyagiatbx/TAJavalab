package arrbasics.BasicsArr;

public class fizzbuzzproblem {
    public static void main(String[] args) {

        // print num 1 to 100 , multiple of 3 print Fizz
        //multiple of 5 print Buzz
        //multiple of both print FizzBuzz

        for(int i =1 ; i<=100 ; i++){

            if(i%3==0 && i%5==0 ){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");

            } else if (i%5 ==0 ) {
                System.out.println("Buzz");

            }
            else
            System.out.println(i);
        }



    }
}

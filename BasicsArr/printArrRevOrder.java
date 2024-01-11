package arrbasics.BasicsArr;

public class printArrRevOrder {
    public static void main(String[] args) {
        //Print array in reverse order
        //print sum of all elements of array
        int sum =0;
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int arrLen = arr1.length;
      //  System.out.println( arrLen);
        System.out.println("Reverse Order is " );
        for(int i= arrLen -1 ; i>=0 ; i--)
            System.out.print("\t" + arr1[i]);
        System.out.println(" ");

        for(int j =0 ; j<=arrLen -1 ;j++){
            sum = sum + arr1[j];

        }
        System.out.println("Sum of all array elements is : " +sum);
    }
}

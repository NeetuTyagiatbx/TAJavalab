package arrbasics;

public class arrPrintandCompare {
    public static void main(String[] args) {
        /* collection of similar type */
        int[] marks = {10,20,30,40};
        String[] names = {"Neetu" , "tyagi" ,"ABC"};

        //System.out.println(marks[0]);

        for(int i=0; i<marks.length ; i++)
            System.out.println(marks[i]);

        int[] arr1 = {1,2,3,4,};
        int[] arr2 = {1,2,3,4,};

        // both pointed to different reference /memory
        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        //both are pointing to same memory

        System.out.println(arr1==arr3);
        //array compare refrence not the values

        System.out.println(arr1.equals(arr2));
        //values will be replaced

        arr3[0]=20;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);


    }


}

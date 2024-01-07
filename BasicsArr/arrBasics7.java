package BasicsArr;

public class arrBasics7 {
    public static void main(String[] args) {

        int[] arr1 = new int[3];

        // print the address location/reference
        System.out.println(arr1);
        for(int i =0 ; i<3 ; i++) {
           // arr1[i] = arr1[i];
            System.out.println(arr1[i]);
        }
        String[] s = new String[2];
        for(int i =0 ; i<2 ; i++) {
            // arr1[i] = arr1[i];
            System.out.println(s[i]);
        }


    }
}

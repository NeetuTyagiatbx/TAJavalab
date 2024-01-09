package arrbasics.BasicsArr;

public class Arr2DBasic {
    public static void main(String[] args) {
        // 2 D array

        int [][] a = new int[2][2] ;
        a[0][0] = 1 ;
        a[0][1] = 2 ;
        a[1][0] = 3 ;
        a[1][1] = 4 ;
        //System.out.println(a.length);
        for(int i=0 ; i<a.length ; i++){
            for(int j =0 ; j<a[i].length ; j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println("");
        }



    }
}

package arrbasics.BasicsArr;

public class Anotherway2DArray {
    public static void main(String[] args) {
        int[][] matrics ={{2,3,4} ,{5,6,7}};
        String[][] namemat = {{"Abc" ,"Bcd" ,"Cde"} ,{"Efg" ,"Fgh" ,"Ghi"}};

        for(int i =0 ; i<matrics.length ; i++){
            for(int j=0 ; j<matrics[i].length ; j++){
                System.out.print(matrics[i][j] +"\t");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("String  Matrics");
        System.out.println("");

        for(int i =0 ; i<namemat.length ; i++){
            for(int j=0 ; j<namemat[i].length ; j++){
                System.out.print(namemat[i][j] +"\t");

            }
            System.out.println("");
        }



    }
}

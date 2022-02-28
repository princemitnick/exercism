public class MatrixTest2 {

    public static void main(String... args){
        test();
    }

    public static void test(){
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++){
            System.out.println(matrix[0][i]);
        }

        /*
        for (int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix.length-1; j++){
                System.out.println(matrix[i][j]+"\t");
            }
        }*/
    }
}

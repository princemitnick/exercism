import java.util.Arrays;

class Matrix {

    String matrixAsString;

    public static void main(String... args){
        String str = "1";
        Matrix matrix = new Matrix(str);

        int [] getRow = matrix.getRow(1);
        for (int i = 0; i < getRow.length; i++){
            System.out.println(getRow[i]);
        }

        //int [] getColum = matrix.getColumn(3);

        //for (int i = 0; i < getColum.length; i++){
         //   System.out.println(getColum[i]);
        //}
    }

    Matrix(String matrixAsString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {

        String [] splitInput = matrixAsString.split("\n");
        String [] row = splitInput[0].split(" ");

        String [][] matrix = new String[splitInput.length][row.length];
        for (int i = 0; i < splitInput.length; i++){
            String [] anyRow = splitInput[i].split(" ");
            matrix [i] = anyRow;
        }
        rowNumber = rowNumber -1;
        int [] rowToReturn = new int [row.length];
        System.out.println(rowToReturn.length);
        for (int i = 0; i < rowToReturn.length; i++){
            rowToReturn [i] = Integer.parseInt(matrix[rowNumber][i]);
        }

        return rowToReturn;
    }

    int[] getColumn(int columnNumber) {
        String [] splitInput = matrixAsString.split("\n");
        String [] row = splitInput[0].split(" ");

        String [][] matrix = new String[splitInput.length][row.length];
        for (int i = 0; i < splitInput.length; i++){
            String [] anyRow = splitInput[i].split(" ");
            matrix [i] = anyRow;
        }

        columnNumber = columnNumber - 1;

        int [] columnToReturn = new int[splitInput.length];
        for (int i = 0; i < columnToReturn.length; i++){
            columnToReturn[i] = Integer.parseInt(matrix[i][columnNumber]);
        }

        return columnToReturn;
    }
}

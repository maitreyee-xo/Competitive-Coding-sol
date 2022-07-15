package practiseCoding;

//import com.sun.tools.javac.util.Convert;

//public class matrixZeroes {
//    int[][][] arr = new int[10][20][30];
////    int x  = arr.length;
//    public static int getNumberOfDimensions(Class<?> type) {
//        if (type.getComponentType() == null) {
//            return 0;
//        } else {
//            return getNumberOfDimensions(type.getComponentType()) + 1;
//        }
//    }
//
//    public void setZeroes(int[][] matrix) {
//        int y = getNumberOfDimensions(int[][][].class);
//        for(int i = 0; i < y; i++)
//        {
//            for(int j = 0; j < arr[i].length; j++)
//            {
//                if( (arr[i][j]) == 0)
//                {
//                    arr[i-1][j-1] = 0;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//                System.out.println(x);
//        int y = getNumberOfDimensions(int[][][].class);
//        System.out.println(y);
//    }
//}

class matrixZeroes {
    public void setZeroes(int[][] matrix) {

        boolean firstCol = false;
        boolean firstRow = false;

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }

        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstCol){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

        if(firstRow){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

    }
}
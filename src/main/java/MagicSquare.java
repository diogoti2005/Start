import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class MagicSquare {
   static int[] arrSquare1 = {8,6,1,4,5,6,8,3,7};
   static int[] arrSquare2 = {2,7,6,9,5,1,4,3,8};
   static int arrayLength1 = arrSquare1.length;
   static int arrayLength2 = arrSquare2.length;
   static int[] array = {0};
    int m[][] = { { 8, 9, 7, 6 },
            { 4, 7, 6, 5 },
            { 3, 2, 1, 8 },
            { 9, 9, 7, 7 } };

    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
            System.out.println(sum);
        }
        return sum;
    }




    public static void main(String[] args) {

        MagicSquare scan = new MagicSquare();
        int[] arr2 = Arrays.copyOfRange(arrSquare1, 0, 1);

        for (int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]); }

        int sum1 = MagicSquare.findSumWithoutUsingStream(arr2);
            System.out.println(sum1);


    }
}
//import java.util.Arrays;

class Util
{
    // change all elements of row x and column y to -1
    public static void changeRowColumn(int[][] mat, int M, int N,
                                       int x, int y)
    {
        for (int j = 0; j < N; j++) {
            if (mat[x][j] != 0) {
                mat[x][j] = -1;
            }
        }

        for (int i = 0; i < M; i++) {
            if (mat[i][y] != 0) {
                mat[i][y] = -1;
            }
        }
    }

    // Function to convert the matrix
    public static void convert(int[][] mat)
    {
        // M x N matrix
        int M = mat.length;
        int N = mat[0].length;

        // traverse the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 0) { // cell (i, j) has value 0
                    // change each non-zero element in row i and
                    // column j to -1
                    changeRowColumn(mat, M, N, i, j);
                }
            }
        }

        // traverse the matrix once again and replace cells having
        // value -1 with 0
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 1, 1, 0, 1, 1 },
                        { 1, 1, 1, 1, 1 },
                        { 1, 1, 0, 1, 1 },
                        { 1, 1, 1, 1, 1 },
                        { 0, 1, 1, 1, 1 }
                };

        // convert the matrix
        convert(mat);

        // print matrix
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
package arrays;

public class Arrays_2D_Intro {
    public static void main(String[] args) {

    /*
    2D ->
    int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    {1,2,3} is a single dimension array

    To iterate:
    we need 2 for loops for rows and columns.


     */


        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //Rows =3
        //Columns = 3
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);

            }
            System.out.println();
        }
    }
}

/*
Output:
1
2
3

4
5
6

7
8
9
 */

package arrays;

import java.util.Scanner;

public class Pyramid_2D_Array {
    public static void main(String[] args) {

    /*

        *
       **
      ***
     ****
    *****


     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();


        //Rows =5
        //Columns = 5
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");

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

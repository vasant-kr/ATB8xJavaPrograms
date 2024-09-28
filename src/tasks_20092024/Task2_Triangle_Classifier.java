package tasks_20092024;

import java.util.Scanner;

public class Task2_Triangle_Classifier {
    //Triangle Classifier
    // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

    // side1, side2, side3 ->
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the side 2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter the side 3: ");
        int s3 = sc.nextInt();

        if (s1 >= 1 && s2 >= 1 && s3 >= 1) {

            if (s1 == s2 && s1 == s3) {
                System.out.println("Equilateral Triangle");
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("Isoceles Triangle");
            } else {
                System.out.println("Scalene Triangle");

            }
        }
        else {
            System.out.println("!!!!!!Please enter only positive numbers!!!!!!!");
        }


    }
}

/*
Output:
Enter the side 1:
5
Enter the side 2:
5
Enter the side 3:
2
Isoceles Triangle
 */



/*
output:
Enter the side 1:
        24
Enter the side 2:
        21
Enter the side 3:
        12
Scalene Triangle
 */




/*
output:
Enter the side 1:
1
Enter the side 2:
2
Enter the side 3:
0
!!!!!!Please enter only positive numbers!!!!!!!
 */

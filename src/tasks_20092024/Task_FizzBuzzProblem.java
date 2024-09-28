package tasks_20092024;

import java.util.Scanner;

public class Task_FizzBuzzProblem {

    /*Write a program that prints numbers from 1 to n.
    However, for multiples of 3, print "Fizz" instead of the number,
    and for multiples of 5, print "Buzz."
    For numbers that are multiples of both 3 and 5, print "FizzBuzz."
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }


    }
}

/*
Output:
Enter the maximum number:
30
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz

 */

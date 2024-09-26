package ex_20092024;

import java.util.Scanner;

public class Lab074_if_condition_Practical6 {
    public static void main(String[] args) {
        // Grade Calculator

//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        // 1. Find user input - Score -> int
        //2. return -> grade -> char
        //3. Basic logic
        // if score >= 90 and score <=100 -> A
        //else if score >= 80 and score <=89 -> B
        //else if score >= 70 and score <=79 -> C
        //else if score >= 60 and score <=69 -> D
        //else -> F

        char grade = 'F';
//        Scanner sc = new Scanner(
        int score = 89; // in future use scanner class for user inputs
        if (score >=90 && score <=100){
            grade = 'A';
        }
        else if (score >=80 && score <=89){
            grade = 'B';
        }
        else if (score >=70 && score <=79){
            grade = 'C';
        }
        else if (score >=60 && score <=69){
            grade = 'D';
        }
        else if (score >0 || score <100){
            System.out.println("LOL!!!");
            grade = 'O';
        }
        else {
            grade = 'F';
        }

        System.out.println("Your Grade is -> "+grade);

    }
}

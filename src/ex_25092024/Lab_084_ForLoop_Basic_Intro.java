package ex_25092024;

public class Lab_084_ForLoop_Basic_Intro {
    public static void main(String[] args) {

        /*
        Loops are for perform a task multiple times

        1. For loop, also for each loop
        2. While loop
        3. Do while loop

        For loop -
        for - keyword
        for (A:B:C){}
        A- initialization
        B - Condition for termination
        C - Increment or Decrement

        All A, B, C are optional

        ALL NUMERIC DATATYPES ARE SUPPORTED apart from char or boolean

        If we don't give condition for termination then the loop will run infinitely
        */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}


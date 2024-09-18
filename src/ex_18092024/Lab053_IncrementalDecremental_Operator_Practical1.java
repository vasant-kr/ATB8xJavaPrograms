package ex_18092024;

public class Lab053_IncrementalDecremental_Operator_Practical1 {
    public static void main(String[] args) {

        // Increment (++) and Decrement (--) Operators
        // Pre and Post
        // Pre-Increment -> ++Operand
        // In this the value is incremented first and then stored
        // Pre-Increment Example1
        int a = 10;
        int b = ++a;   // a= a+1 = 11

        System.out.println(b); //11
        System.out.println(a);//11

        // Pre-Increment Example2
        int a1 = 10;
        System.out.println(++a1); // Value is incremented first and then printed so it prints 11
        System.out.println(a1); // It prints 11 as the value is stored in line17

        // Post-Increment Example1
        int a_post = 10;
        System.out.println(a_post++); // Prints the value first and then stores. So it prints 10 but next time we print a_post it will print 11.
        System.out.println(a_post);  // Prints incremented value after executing line 24

    }
}

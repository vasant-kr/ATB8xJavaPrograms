package ex_18092024;

public class Lab056_Incremental_Operator_Practical4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a); // Prints 21


        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |               |     (a++)+a
        //                                  (10)+11

    }
}

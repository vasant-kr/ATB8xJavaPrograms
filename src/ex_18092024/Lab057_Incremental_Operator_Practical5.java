package ex_18092024;

public class Lab057_Incremental_Operator_Practical5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // Prints 22


        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |               |     (a++)+(++a)
        //                                  (10)+(Increment value of a where a is 11 now)
        //                                  (10)+(12) = 22

    }
}

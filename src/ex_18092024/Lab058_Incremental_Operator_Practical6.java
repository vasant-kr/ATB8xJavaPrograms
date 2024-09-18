package ex_18092024;

public class Lab058_Incremental_Operator_Practical6 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a); // Prints 23
        System.out.println(a);// Prints 12


        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |               |     (++a)+(++a)
        //                                  (11)+(Increment value of a where a is 11 now)
        //                                  (11)+(12) = 23

    }
}

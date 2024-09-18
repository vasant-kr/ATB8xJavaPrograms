package ex_18092024;

public class Lab059_Incremental_Operator_Practical7 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); // Prints 34
        System.out.println(a);// Prints 13


        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |               |     (++a)+(a++)+(a++)
        //                                  (11)+(11)+(Increment value of a where a is 12 now=12, later a becomes 13)
        //                                  (11)+(11) +(12) = 34


        // Part A -> ++a, Exp = 11, a =11
        // Part B -> a++, Exp = 11, a =12
        // Part C -> a++, Exp = 12, a =13


    }
}

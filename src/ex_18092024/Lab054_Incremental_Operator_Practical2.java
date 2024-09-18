package ex_18092024;

public class Lab054_Incremental_Operator_Practical2 {
    public static void main(String[] args) {
        int a =10;
        int result = ++a;
        System.out.println(a); // This will print 11 as the value is incremented first and then printed in this line.
        System.out.println(result);

        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |   result =11  |     11
        // 7            |   result =11  |     11
        // 8            |   result =11  |     11


    }
}

package ex_18092024;

public class Lab055_Incremental_Operator_Practical3 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a); // This will print 10 as the value is assigned and printed first and then incremented in this line.
        System.out.println(result);

        // Line No.     |   Exp         |     a
        // 5            |               |     10
        // 6            |   result =10  |     11
        // 7            |   result =10  |     11
        // 8            |   result =10  |     11

    }
}

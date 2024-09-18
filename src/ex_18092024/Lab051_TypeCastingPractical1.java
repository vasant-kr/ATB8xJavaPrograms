package ex_18092024;

public class Lab051_TypeCastingPractical1 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit - JVM will not allow - Invalid

        short s1 = (short)phone_no; // Narrowing - Explicit - Loss
        System.out.println(s1); // Only whatever short can hold will be stored in s1.
        /* This prints 5866.

           Explanation:
           9876543210 will be converted to binary -> 1001001100101100000001011011101010. This is 34 bits
           short can only store16 bits, so the least significant 16 bits will be stored in short.
           Only 0001011011101010 will be stored in short.
           Decimal number for 0001011011101010 is 5866
         */



    }
}

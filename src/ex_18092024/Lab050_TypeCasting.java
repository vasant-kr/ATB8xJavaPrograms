package ex_18092024;

public class Lab050_TypeCasting {
    public static void main(String[] args) {
        // Type casting -> Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with datatype) - loss

        // Widening  -  Smaller Datatype can be converted to bigger Datatype
        byte b = 10;
        int a = b;   // Valid - Implicit Casting - JVM does this automatically - lossless
        int a1 = b;   // Valid - Explicit Casting - JVM - line 11 and line 12 are same

        // Narrowing  - Bigger Datatype can be converted to smaller Datatype
        int val = 300;
        //byte b1 = val;    // Invalid - Implicit casting - JVM
        byte b2 = (byte) val;  // Explicit casting - Loss of data - The data will be stored to byte howmuchever it can hold, rest of the data will not be stored
        System.out.println(b2);  // 44 as only the last 8 bits of the 32 bits of 300 are stored which has the value 44


    }
}

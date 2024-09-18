package tasks_18092024;

public class Task1 {
    public static void main(String[] args) {

        // Examples of Widening and Narrowing


        // Widening
        byte b = 50;
        //Implicit:
        int a = b;

        //Explicit
        int a1 = (int)b;   // Valid - Explicit Casting - JVM - line 11 and line 12 are same

        // Narrowing
        int val = 500;
        //byte b1 = val;    // Invalid - Implicit casting - JVM
        byte b2 = (byte) val;  // Explicit casting - Loss of data - The data will be stored to byte howmuchever it can hold, rest of the data will not be stored
        System.out.println(b2);  // -12 as only the last 8 bits of the 32 bits of 500 are stored which has the value -12


    }
}

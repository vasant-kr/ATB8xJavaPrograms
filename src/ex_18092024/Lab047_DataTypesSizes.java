package ex_18092024;

public class Lab047_DataTypesSizes {
    public static void main(String[] args) {

        byte a =10;   //1 Byte , 8 bits       -128 to 127
        long l = 10l; //8 Bytes, 64 bits
        String s = "Vasant"; // 8 Bytes, 64 bits  - Non-primitive DataType
        System.out.println(a);
        System.out.println(l);
        System.out.println(s);

        byte b = 10;
        System.out.println(a+b); // Arithmetic Operation of 2 bytes converts to integer

        char a1='A';
        char b1='B';
        System.out.println(b1);      // Without any Arithmetic operation their char value will be printed
        int c1 = a1 + b1;
        System.out.println(c1);      // 131 = 65+66......ASCII values of a1 and b1 will be added and stored in int or any other bigger data type

    }
}

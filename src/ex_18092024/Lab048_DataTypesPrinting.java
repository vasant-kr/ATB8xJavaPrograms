package ex_18092024;

public class Lab048_DataTypesPrinting {
    public static void main(String[] args) {
        System.out.println('A' == 66);      // false as ASCII value of 'A' is 65
        System.out.println('A' == 65);      // true as ASCII value of 'A' is 65
        short s = 10;
        char c = 'A';
        int result = s + c;     //75   as it adds 10 to the ASCII value f 'A' which is 65
        System.out.println(result);
    }
}

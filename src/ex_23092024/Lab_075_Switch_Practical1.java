package ex_23092024;

public class Lab_075_Switch_Practical1 {
    public static void main(String[] args) {

        /*
        switch is a multiway branch statement
        it checks the condition
        Java switch statement executes one statement from multiple statements

        It needs breaks at each condition (cases) otherwise it will keep on executing every case after the actual case

        There is default case as well which will be executed if no case matches the condition
        For default case the break; is optional

        Java switch expressions must be of numeric data type (byte, char, short, int, long(with its Wrapper type), enums and String)
        Variables are not allowed
         */

        int day = 1;
        switch (day) {


            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("I dont know what day it is:(");
                break;

        }
        System.out.println("End of loop");
    }
}

/*
Output:
MONDAY
End of loop
 */

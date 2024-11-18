package ex_23092024;

public class Lab_079_Switch_New_JDK13_2 {
    public static void main(String[] args) {

       // We can have multiple values in the cases
        //In line 13 we are essentially telling - if the browser matches chrome or firefox or edge then run this

        int itemCode = 3;

        switch (itemCode) {

            case 1, 2 -> System.out.println("Staring chrome browser");
            case 3 -> {
                System.out.println("Staring safari browser");
                System.out.println("this is test browser");
            }

            default ->
                System.out.println("I dont know which browser it is:(");

        }
        System.out.println("End of loop");
    }
}

/*
Output :
Staring safari browser
this is test browser
End of loop

 */

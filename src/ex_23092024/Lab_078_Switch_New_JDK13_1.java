package ex_23092024;

public class Lab_078_Switch_New_JDK13_1 {
    public static void main(String[] args) {

       // We can have multiple values in the cases
        //In line 13 we are essentially telling - if the browser matches chrome or firefox or edge then run this

        String browser = "chrome";

        switch (browser) {

            case "chrome", "firefox", "edge":
                System.out.println("Staring chrome browser");
                break;
            case "safari":
                System.out.println("Staring safari browser");
                break;

            default:
                System.out.println("I dont know which browser it is:(");
                break;

        }
        System.out.println("End of loop");
    }
}

/*
Output :
Staring chrome browser
End of loop
 */

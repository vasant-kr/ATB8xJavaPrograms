package ex_23092024;

public class Lab_077_Switch_Practical3_BrowserSelection {
    public static void main(String[] args) {

       // If user wants types Chrome then chrome will execute ,etc.

        String browser = "chrome";

        switch (browser) {

            case "chrome":
                System.out.println("Staring chrome browser");
                break;
            case "firefox":
                System.out.println("Staring firefox browser");
                break;
            case "edge":
                System.out.println("Staring edge browser");
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

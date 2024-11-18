package ex_23092024;

public class Lab_083_Switch_Practical2 {
    public static void main(String[] args) {

        String browser = "chrome";

        switch (browser) {
            case "chrome":
                System.out.println("launch chrome");
                break;
            case "firefox":
                System.out.println("launch firefox");
                break;
            case "safari":
                System.out.println("launch safari");
                break;
            case "edge":
                System.out.println("launch edge");
                break;
            default:
                System.out.println("Please pass the right browser..." +browser);
                break;
        }

    }
}

/*
Output:
F
End of loop
 */

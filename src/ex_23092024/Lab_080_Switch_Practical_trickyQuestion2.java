package ex_23092024;

public class Lab_080_Switch_Practical_trickyQuestion2 {
    public static void main(String[] args) {

       // If user wants types Chrome then chrome will execute ,etc.

        int a =11;

        switch (-1) {

            case 1:
                System.out.println("Staring chrome browser");
                break;
            case -1:
                System.out.println("Staring firefox browser");
                break;
            case 11:
                System.out.println("Staring edge browser");
                break;
            default:
                System.out.println("Default");
                break;

        }
        System.out.println("End of loop");
    }
}

/*
Output :
Staring firefox browser
End of loop

int a is given just confuse us. As -1 in switch matches the case that particular case will be executed
 */

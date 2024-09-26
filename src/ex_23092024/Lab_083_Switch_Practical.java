package ex_23092024;

public class Lab_083_Switch_Practical {
    public static void main(String[] args) {


        char ch = 'C';
        switch (ch) {

            case 'A' + 1:
                System.out.println("D");
                break;
            case 'A':
                System.out.println("E");
                break;
            case 'A' + 2:
                System.out.println("F");
                break;

            default:
                System.out.println("test");
                break;

        }
        System.out.println("End of loop");
    }
}

/*
Output:
F
End of loop
 */

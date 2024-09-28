package ex_25092024;

public class Lab_085_ForLoop_Practical2 {
    public static void main(String[] args) {

        /*
        b1 is always true so infinite loop
        */
//        final boolean b1 = true;
//
//        for (int i = 0; b1; i++) {
//            System.out.println("Hellloooo");






        /*
        No condition in between so infinite loop
        */

//        for (int i = 0;;) {
//            System.out.println("Hellloooo");
//
//        }




        /*
        No initialization No condition in between so infinite loop
        */

//        for (;;) {
//            System.out.println("Hellloooo");
//
//        }

        /*
        condition fails as soon as it starts so no output
         */

        for (int i =0; i >0; i--){
            System.out.println(i);
        }

    }
}


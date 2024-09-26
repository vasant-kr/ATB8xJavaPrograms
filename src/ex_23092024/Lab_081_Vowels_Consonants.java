package ex_23092024;

public class Lab_081_Vowels_Consonants {
    public static void main(String[] args) {

        /*
       Program to find if a character is vowel or consonant
         */

        char ch = 'p';
        switch (ch) {


            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("vowel");
                break;

            default:
                System.out.println("consonant");
                break;

        }
        System.out.println("End of loop");
    }
}

/*
Output:
consonant
End of loop
 */

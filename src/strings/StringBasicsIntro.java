package strings;

public class StringBasicsIntro {

    /*
    Strings - Bunch of Characters.
    It is a Non-Primitve Datatype
    String is a class - final Class, which means it cannot be changed

    Character is like - char c='A';

    String is like - String a = "Vasant"; - Contains multiple characters

    Strings in Java are immutable in nature - Means, once a String is created, its value cannot be changed
    Any modification results in new String instance

    How Strings are created?
    1. By using assignment operator -> = Operator -> In String Constant Pool (JVM)
        E.g., String a = "Vasant";
    2. by new Operator -> In Heap Area in JVM where Objects are there
        E.g., String name = new String("Vasant");

        All kinds of String are immutable

        If say String a = "Vasant"; is there then Vasant will be stored in SCP in JVM with the a reference pointing to it
        But if again we do String a = "Swati"; then Swati will also be created in SCP in JVM and Vasant is also there
        but the a reference will now point to Swati, not Vasant.


        == checks only the reference locations and not the values
        .equals() checks the values of the strings

        If we create Sting in SCP by String s1= "Vasant"; amd String s2="Vasant";
        then s1==s2 will return true as both  the references will be pointing to same thing. New SString will not be created as
        JVM checks the SCP and sees the identicalString is present so it assigns new reference also to it.

        But when we create String in Heap, then s1==s2 will be false
        as these 2 are different objects and Strings are created again even though identical String is present in Heap area


      Major String FUNCTIONS:
      String str = "Vasant";

      1. String length - str.length();
      2. Substring - str.substring(1,5);
      3. str.trim(); it will remove spaces from start and end
      4. str.toUpperCase(); - to convert the string to Upper case
      5. str.toLowerCase(); - to convert the string to Lower case
      6. str.charAt(index); - to find which char is at that particular index
      7. str.indexOf("V"); - to find what is the first indexof a char
      8. str.contains("n"); - to find if the string contains that character
      9. str.isEmpty(); - to check if String is empty
      10. str.split(" "); - to split a string based on regex of char, it returns array







     */
}
